class Solution
{
public:
    int lengthOfLongestSubstring(string s)
    {
        int l = 0;
        int r = 0;
        int len = 0;
        vector<int> mpp(256, -1);
        while (r < s.size())
        {
            if (mpp[s[r]] != -1)
                l = max(mpp[s[r]] + 1, l);
            mpp[s[r]] = r;
            len = max(len, r - l + 1);
            r++;
        }
        return len;
    }
};