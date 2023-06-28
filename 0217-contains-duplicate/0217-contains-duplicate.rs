use std::collections::HashSet;

impl Solution {
    pub fn contains_duplicate(nums: Vec<i32>) -> bool {
        let nums_len = nums.len();
        let unique_nums: HashSet<_> = nums.into_iter().collect();

        nums_len != unique_nums.len()
    }
}