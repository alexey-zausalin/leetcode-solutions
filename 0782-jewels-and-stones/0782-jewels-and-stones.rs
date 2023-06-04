impl Solution {
    pub fn num_jewels_in_stones(jewels: String, stones: String) -> i32 {
        stones.chars().filter_map(|c| jewels.find(c)).count() as i32
    }
}