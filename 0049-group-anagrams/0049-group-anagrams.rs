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

#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn test_1() {
        let input = vec!["eat", "tea", "tan", "ate", "nat", "bat"]
            .into_iter()
            .map(String::from)
            .collect();
        let output = vec![vec!["bat"], vec!["nat", "tan"], vec!["ate", "eat", "tea"]];

        assert_eq!(Solution::group_anagrams(input), output);
    }

    #[test]
    fn test_2() {
        let input = vec![""].into_iter().map(String::from).collect();
        let output = vec![vec![""]];

        assert_eq!(Solution::group_anagrams(input), output);
    }

    #[test]
    fn test_3() {
        let input = vec!["a"].into_iter().map(String::from).collect();
        let output = vec![vec!["a"]];

        assert_eq!(Solution::group_anagrams(input), output);
    }
}
