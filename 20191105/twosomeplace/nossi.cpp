#include <iostream>
#include <vector>
#include <map>

using namespace std;

int minLength = 0x7fffffff;

map<int, int> hashtable;

int solution(vector<int> v)
{
    int answer = -1;
    for (int i = 0; i < v.size(); i++)
    {
        int key = v[i];
        auto itr = hashtable.find(key);
        if (itr == hashtable.end())
            hashtable[key] = i;
        else
        {
            int tmpL = i - hashtable[key];
            hashtable[key] = i;
            if (tmpL < minLength)
                minLength = tmpL;
        }
    }
    if (minLength != 0x7fffffff)
        answer = minLength;

    return answer;
}
int main()
{
    vector<int> v{1000002, 1000001, 1000003, 1000001, 1000004, 1000002, 1000001, 1000003};
    cout << solution(v);
}
