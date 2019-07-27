class Solution:
    def defangIPaddr(self, address: str) -> str:
        answer = ""
        for s in address:
            if s == ".":
                answer = answer + "[.]"
            else:
                answer = answer + s
        return answer