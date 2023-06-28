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

#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn test_1() {
        assert!(Solution::is_anagram(
            "anagram".to_string(),
            "nagaram".to_string()
        ));
    }

    #[test]
    fn test_2() {
        assert!(!Solution::is_anagram("rat".to_string(), "car".to_string()));
    }
}
