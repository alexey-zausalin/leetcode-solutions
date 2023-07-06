use std::collections::HashMap;

impl Solution {
    pub fn top_k_frequent(nums: Vec<i32>, k: i32) -> Vec<i32> {
        let mut bufer = HashMap::new();
        for num in nums {
            bufer.entry(num).and_modify(|c| *c += 1).or_insert(1);
        }

        let mut count_vec: Vec<(_, _)> = bufer.iter().collect();
        count_vec.sort_by(|a, b| b.1.cmp(a.1));

        count_vec
            .iter()
            .take(k as usize)
            .map(|i| *i.0)
            .collect::<Vec<_>>()
    }
}

#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn test_1() {
        let input = vec![1, 1, 1, 2, 2, 3];
        let output = vec![1, 2];

        assert_eq!(Solution::top_k_frequent(input, 2), output);
    }

    #[test]
    fn test_2() {
        let input = vec![1];
        let output = vec![1];

        assert_eq!(Solution::top_k_frequent(input, 1), output);
    }
}
