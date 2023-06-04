use std::collections::HashMap;

struct Solution;

impl Solution {
    pub fn two_sum(nums: Vec<i32>, target: i32) -> Vec<i32> {
        let mut bufer: HashMap<i32, i32> = HashMap::new();
        for (i, num) in nums.into_iter().enumerate() {
            if let Some(compliment_i) = bufer.get(&(target - num)) {
                return vec![*compliment_i, i as i32];
            }
            bufer.insert(num, i as i32);
        }
        vec![]
    }
}

#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn test_1() {
        let input = vec![2, 7, 11, 15];

        assert_eq!(Solution::two_sum(input, 9), vec![0, 1]);
    }

    #[test]
    fn test_2() {
        let input = vec![3, 2, 4];

        assert_eq!(Solution::two_sum(input, 6), vec![1, 2]);
    }

    #[test]
    fn test_3() {
        let input = vec![3, 3];

        assert_eq!(Solution::two_sum(input, 6), vec![0, 1]);
    }
}
