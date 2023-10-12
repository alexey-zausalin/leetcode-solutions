class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        lettersCount = ord("z") - ord("a") + 1
        
        counter = collections.defaultdict(list)
        for string in strs:
            itemCounter = [0] * lettersCount
            for s in string:
                key = ord(s) - ord("a")
                itemCounter[key] += 1

            key = tuple(itemCounter)
            counter[key].append(string)

        return counter.values()