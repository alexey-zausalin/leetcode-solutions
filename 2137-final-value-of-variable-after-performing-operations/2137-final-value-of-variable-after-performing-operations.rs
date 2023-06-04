struct Solution;

impl Solution {
    pub fn final_value_after_operations(operations: Vec<String>) -> i32 {
        operations
            .iter()
            .map(|op| match op.as_str() {
                "++X" | "X++" => 1,
                "--X" | "X--" => -1,
                _ => 0,
            })
            .sum()
    }
}

#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn test_1() {
        let input = vec!["--X", "X++", "X++"]
            .into_iter()
            .map(String::from)
            .collect();

        assert_eq!(Solution::final_value_after_operations(input), 1);
    }

    #[test]
    fn test_2() {
        let input = vec!["++X", "++X", "X++"]
            .into_iter()
            .map(String::from)
            .collect();

        assert_eq!(Solution::final_value_after_operations(input), 3);
    }

    #[test]
    fn test_3() {
        let input = vec!["X++", "++X", "--X", "X--"]
            .into_iter()
            .map(String::from)
            .collect();

        assert_eq!(Solution::final_value_after_operations(input), 0);
    }
}
