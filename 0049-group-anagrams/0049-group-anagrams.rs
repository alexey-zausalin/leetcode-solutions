use core::iter::FromIterator;
use std::collections::hash_map::Entry;
use std::collections::HashMap;

impl Solution {
    pub fn group_anagrams(strs: Vec<String>) -> Vec<Vec<String>> {
        let mut buffer: HashMap<String, Vec<String>> = HashMap::new();
        for str in strs.into_iter() {
            let mut chars: Vec<char> = str.chars().collect();
            chars.sort_by(|a, b| b.cmp(a));

            let sorted_str = String::from_iter(chars);

            let entry = buffer.entry(sorted_str);
            if let Entry::Occupied(mut e) = entry {
                e.get_mut().push(str);
            } else {
                entry.or_insert(vec![str]);
            }
        }

        buffer.into_values().collect()
    }
}