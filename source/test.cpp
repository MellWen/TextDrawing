#include <iostrem>
#include <fstrem>
#include <stdlib.h>
#include <stdio.h>
#include <float.h>
#include <limits.h>
#include <errno.h>
#include <string.h>

using namespace std;

typedef struct NODE_ITEM
{
	struct NODE_ITEM*	pNext;
	struct NODE_ITEM*	pLast;
	int					nContent;
}NODE_ITEM,*LPNODE_ITEM;

class CMClass
{
public:
	CMClass();
	virtual ~CMClass();
public:
	bool Control(int nNum);
protected:
private:
	LPNODE_ITEM	m_pHead;
	LPNODE_ITEM	m_pTail;
	int			m_nNum;
};

int main(int argc,char *argv[],char *envp[])
{
	CMClass	hClass;

	return 0;
}