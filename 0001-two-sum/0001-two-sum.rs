use std::collections::HashMap;

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
