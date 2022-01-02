#include <bits/stdc++.h>

using namespace std;

/*
 * Complete the 'beautifulStrings' function below.
 *
 * The function is expected to return a LONG_INTEGER.
 * The function accepts STRING s as parameter.
 */


long long beautifulStrings(string st) {
    int cnt = 0;
    vector<int> v;
    long long ans = 0;
    for (int i = 0; i < st.size(); i++)
    {
        if (i == 0 || st[i] == st[i - 1])
            ++cnt;
        else
        {
            v.push_back(cnt);
            cnt = 1;
        }
    }
    v.push_back(cnt);
    for (int i = 0; i < v.size(); i++)
    {
        if (v[i]>1)
            ++ans;
    }

    for (int i = 1; i +1< st.size(); i++)
    {
        if (st[i - 1] == st[i + 1] && st[i] != st[i - 1])
            --ans;
    }
    ans += v.size() * 1ll * (v.size() - 1) / 2;
    return ans;
}

int main()
{
    ofstream fout(getenv("OUTPUT_PATH"));

    string s;
    getline(cin, s);

    long result = beautifulStrings(s);

    fout << result << "\n";

    fout.close();

    return 0;
}