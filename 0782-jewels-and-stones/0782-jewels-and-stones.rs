struct Solution;

impl Solution {
    pub fn num_jewels_in_stones(jewels: String, stones: String) -> i32 {
        stones.chars().filter_map(|c| jewels.find(c)).count() as i32
    }
}

#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn test_1() {
        let jewels = "aA".into();
        let stones = "aAAbbbb".into();

        assert_eq!(Solution::num_jewels_in_stones(jewels, stones), 3);
    }

    #[test]
    fn test_2() {
        let jewels = "b".into();
        let stones = "BB".into();

        assert_eq!(Solution::num_jewels_in_stones(jewels, stones), 0);
    }
}
