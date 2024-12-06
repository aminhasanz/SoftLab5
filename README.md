# SoftLab5
پس از دانلود و نصب برنامه و مانیتور کردن JavaCup بر روی YourKit طبق اسکرین شات قرار داده شده قسمتی از کد که بیشترین میزان مصرف پردازنده را دارد خط ۲۹ام یعنی دو حلقه تودرتو است.

![alt text](https://github.com/aminhasanz/SoftLab5/blob/main/Screenshot%20(39).png?raw=true)

نمودار اجرای برنامه هم به این صورت است:

![alt text](https://github.com/aminhasanz/SoftLab5/blob/main/Screenshot%20(41).png?raw=true)

پس از اصلاح تابع temp به این صورت وضعیت پردازش کد بهینه تر میشود:

public static void temp() {
        ArrayList a = new ArrayList();
        for (int i = 0; i < 10000; i++)
        {
            for (int j = 0; j < 20000; j++) {
                a.add(i + j);
            }
        }
    }

بعد از اصلاح کد نمودار پردازش کد به این صورت میشود:


![alt text](https://github.com/aminhasanz/SoftLab5/blob/main/Screenshot%20(40).png?raw=true)


اکنون قطعه کد زیر که اجرای پیدا کردن اعداد اول 1 تا 10000000 هست را برای بخش دوم اجرا میکنیم

![image](https://github.com/user-attachments/assets/c73544b9-6966-4fb8-b27e-c2a11217feca)

در کد بالا، الگوریتم برای بررسی اینکه آیا یک عدد اول است یا نه، از یک حلقه تو در تو استفاده می‌کند که می‌تواند منجر به مصرف بالای منابع شود، به ویژه برای اعداد بزرگ. 
نمودار اجرای برنامه و استفاده از منابع:

![image](https://github.com/user-attachments/assets/540b0a0a-2278-4883-864c-d152aea82a6b)


![image](https://github.com/user-attachments/assets/8dd65826-5935-42da-8c0f-71ebb5f68b9a)


