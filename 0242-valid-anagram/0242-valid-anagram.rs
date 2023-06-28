use std::collections::HashMap;

impl Solution {
    pub fn is_anagram(s: String, t: String) -> bool {
        if s.len() != t.len() {
            return false;
        }

        let mut letters: HashMap<char, i32> = HashMap::new();
        for (a, b) in s.chars().zip(t.chars()) {
            *letters.entry(a).or_default() += 1;
            *letters.entry(b).or_default() -= 1;
        }

        letters.into_values().all(|count| count == 0)
    }
}