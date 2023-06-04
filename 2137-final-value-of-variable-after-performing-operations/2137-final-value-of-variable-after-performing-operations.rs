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