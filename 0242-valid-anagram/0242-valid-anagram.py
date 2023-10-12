class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False

        letters = {}
        for value in s:
            letters[value] = letters.get(value, 0) + 1
            
        for value in t:
            letters[value] = letters.get(value, 0) - 1
        
        for value in letters.values():
            if value != 0:
                return False

        return True
        