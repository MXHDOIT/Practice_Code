#define _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
#include<string.h>
#define SIZE 99

char s[SIZE],ch;  //�洢�����ַ���
int index;
int m;  //��¼����
int sign; //��־   
//-1 ����
// 0 #
// 1 begin 2 if 3 then 4 while 5 do 6 end 
// 7 < 8 <=  9 > 10 >= 11+ 12 ++ 13 - 14 -- 15 ! 16 != 17 = 18 == 19 / 20*  21(  22)  23{  24 }  25; 26 \ 27 :
//99 ��ʶ�� 100 ����
char* sys[6] = { "begin","if","then","while","do","end" };  //�ؼ���
int sum;	//��¼����
char token[20]; //��¼�ַ���


void Judge();  //��������
int main()
{
	index = 0;   //�±�ʹ��
	printf("������һ���ַ���(��#�ý���):\n");

	do {
		scanf("%c", &ch);
		s[index++] = ch;
	} while (ch != '#');

	index = 0;
	do {
		Judge();
		switch (sign)
		{
			case 100:
				printf("(%-10d%-5d)\n", sum, sign);
				break;
			case -1:
				printf("��������\n");
				return 0;
			default:
				printf("(%-10s%5d)\n", token, sign);
				break;
		}

	} while (sign != 0);
	return 0;
}

void Judge()
{
	sum = 0;  //�������¿�ʼ��¼
	ch = s[index++];
	m = 0;    //��¼�ַ���������

	while ((ch == ' ')||(ch == '\n'))  //����ַ���Ϊ�ո���߻���ֱ�ӹ�
	{
		ch = s[index++];
	}

	if (((ch >= 'a') && (ch <= 'z')) || ((ch >= 'A') && (ch <= 'Z')))  //���ַ�Ϊ�ַ�
	{
		while (((ch >= 'a') && (ch <= 'z')) || ((ch >= 'A') && (ch <= 'Z')) || ((ch >= '0') && (ch <= '9')))
		{
			token[m++] = ch;
			ch = s[index++];
		}
		index--;
		sign = 99;
		for (int n = 0; n < 6; n++)
		{
			if (strcmp(token, sys[n]) == 0)
			{
				sign = n + 1;
				break;
			}
		}
	}
	else if ((ch >= '0') && (ch <= '9'))   //���ַ�Ϊ����
	{
		while ((ch >= '0') && (ch <= '9'))
		{
			
			sum = sum * 10 + ch - '0';
			ch = s[index++];
		}
		index--;
		sign = 100;
	}
	else   //���ַ�Ϊ����
	{
		switch (ch)
		{
		case '<':
			token[m++] = ch;
			ch = s[index++];
			if (ch == '=')
			{
				sign = 8;
				token[m++] = ch;
			}
			else
			{
				sign = 7;
				index--;
			}
			break;
		case '>':
			token[m++] = ch;
			ch = s[index++];
			if (ch == '=')
			{
				sign = 10;
				token[m++] = ch;
			}
			else
			{
				sign = 9;
				index--;
			}
			break;
		case '=':
			token[m++] = ch;
			ch = s[index++];
			if (ch == '=')
			{
				sign = 18;
				token[m++] = ch;
			}
			else
			{
				sign = 17;
				index--;
			}
			break;
		case '!':
			token[m++] = ch;
			ch = s[index++];
			if (ch == '=')
			{
				sign = 16;
				token[m++] = ch;
			}
			else
			{
				sign = 15;
				index--;
			}
			break;
		case '+':
			token[m++] = ch;
			ch = s[index++];
			if (ch == '+')
			{
				sign = 12;
				token[m++] = ch;
			}
			else
			{
				sign = 11;
				index--;
			}
			break;
		case '-':
			token[m++] = ch;
			ch = s[index++];
			if (ch == '-')
			{
				sign = 14;
				token[m++] = ch;
			}
			else
			{
				sign = 13;
				index--;
			}
			break;		
		case '/':
			sign = 19;
			token[m++] = ch;
			break;
		case '*':
			sign = 20;
			token[m++] = ch;
			break;
		case '(':
			sign = 21;
			token[m++] = ch;
			break;
		case ')':
			sign = 22;
			token[m++] = ch;
			break;
		case '{':
			sign = 23;
			token[m++] = ch;
			break;
		case '}':
			sign = 24;
			token[m++] = ch;
			break;
		case ';':
			sign = 25;
			token[m++] = ch;
			break;
		case '\"':
			sign = 26;
			token[m++] = ch;
			break;
		case '#':
			sign = 0;
			token[m++] = ch;
			break;
		case ':':
			sign = 27;
			token[m++] = ch;
			break;
		default: sign = -1;
			break;
		}
	}
	token[m] = '\0';
}
