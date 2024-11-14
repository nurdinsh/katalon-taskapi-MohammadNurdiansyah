# Final Project API Testing
Final Project for Automation Testing with Katalon Studio in TAK as Learning Partner

## Informasi Dasar
Task API Testing ini adalah sebuah Final Project dari `Tes Aplikasi Kamu` dengan topik `Automation API Testing with Katalon`, Task berfokus pada bagimana cara kerja API dengan melakukan testing pada semua end Point, yang dibuat oleh:

Nama		                 : `Mohammad Nurdiansyah`\
Final Project Website    : [`Repository FP Website`](https://github.com/nurdinsh/katalon-taskfinal-MohammadNurdiansyah)\
Final Project Mobile     : [`Repository FP Mobile`](https://github.com/nurdinsh/katalon-taskmobile-MohammadNurdiansyah)\
Final Project API        : [`Repository FP API`](https://github.com/nurdinsh/katalon-taskapi-MohammadNurdiansyah)

---

# Panduan Penggunaan Aplikasi

## Requirement yang harus disipkan sebelum running aplikasi ini adalah :
- Menggunakan `Katalon Studio`
- Testing dilakukan pada End-Point API yang disediakan oleh [`restful-booker`](https://restful-booker.herokuapp.com/apidoc/)

## Ringkasan Hasil Testing
Pada pelaksanaan testing dilakukan testing pada `11 Test Case` dengan hasil :
```
11 Passed
0 Failed
0 Not Executed
```
Sehingga hasil pengujian adalah `100% Passed`

## Report
Pada pengujian, jika harus satu-satu test case di test akan memakan waktu lama, sehingga dibuat `Test Suite` agar dapat menjalankan beberapa test case secara bersamaan yaitu
```
TS01_Get Booking Id
TS02_Update Booking
TS03_Partial Update Booking
TS04_Post, Put, Patch, dan Delete
TS05_End to End
```
Untuk lebih memudahkan pengujian dibuat `Test Suites Collection` agar dapat menjalankan beberapa Test Suites secara bersamaan yaitu
```
TSC_Test All
```

# End Point
Keseluruhan Endpoint pada Reqress diuji pada project ini adalah :

## Auth
### POST CreatToken
```
https://restful-booker.herokuapp.com/auth
```
Untuk dapat login, harus dengan memasukan data user yang sudah disediakan\
Lalu masukan data pada `HTTP BODY` dengan atribut `TEXT` dan `JSON`\
```
{
    "username" : "admin",
    "password" : "password123"
}
```
Akan menghasilkan response code `200 OK` dan `TOKEN`\
Result Login Success
```
{
  "token":"e8061fec1357cd1"
}
```
Jika memasukan data yang tidak sesuai, maka akan menghasilkan response code `200` tetapi `TOKEN` tidak keluar\
Result Login Failed
```
{
  "reason":"Bad credentials"
}
```


## Booking
### GET GetBookingIds
```
https://restful-booker.herokuapp.com/booking
```

Untuk mendapatkan single ID Booking berdasarkan `PARAMETER`, yang mana disi dengan `firstname` dan `lastname`\
Akan menghasilkan response code `200` dan result user yang dimaksud
```
  {
    "bookingid":1480
  },
  {
    "bookingid":504
  },
  {
    "bookingid":2077
  },
  {
    "bookingid":2124
  },
  {
    "bookingid":343
  },
  {
    "bookingid":1788
  },
```
Jika request tidak ada maka akan menghasilkan response code `200` dan result
```
https://restful-booker.herokuapp.com/booking?firstname=Mohammad&lastname=Nurdiansyah&=
```
```
[
]

```
Jika request ada maka akan menghasilkan code response code `200 OK` dan result single ID
```
https://restful-booker.herokuapp.com/booking?firstname=Mohammad&lastname=Nurdiansyah&=
```
```
  {
    "bookingid":2
  }
```

### GET GetBooking
```
https://restful-booker.herokuapp.com/booking/:id
```
Untuk mendapatakn data user, dengan mengambil id user dengan id 2\
Akan menghasilkan response code `200` dan result
```
{
  "firstname":"Dian",
  "lastname":"Syah",
  "totalprice":201,
  "depositpaid":true,
  "bookingdates":{
    "checkin":"2024-12-19",
    "checkout":"2025-12-19"
  },
  "additionalneeds":"Coffee"
}
```
Jika id user yang dimasukan tidak sesuai\
Akan menghasilkan response code `404 Not Found` dan tidak ada result
```
Not Found
```

### POST CreatsBooking
```
https://restful-booker.herokuapp.com/booking
```
Untuk menambah data user dengan memasukan pada `HTTP BODY` dengan atribut `TEXT` dan `JSON`
```
{
  "firstname": "Dian",
  "lastname": "Syah",
  "totalprice": 201,
  "depositpaid": true,
  "bookingdates":{
    "checkin": "2024-12-19",
    "checkout": "2025-12-19"
  },
  "additionalneeds": "Coffee"
}
```
Akan menghasilkan response code `200 OK` dan data akan ditambah
```
{
  "bookingid":3989,
  "booking":{
    "firstname":"Dian",
    "lastname":"Syah",
    "totalprice":201,
    "depositpaid":true,
    "bookingdates":{
      "checkin":"2024-12-19",
      "checkout":"2025-12-19"
    },
    "additionalneeds":"Coffee"
  }
}
```

### PUT UpdateBooking
```
https://restful-booker.herokuapp.com/booking/3989
```
Untuk mengubah data user berdasar id nya\
Dengan memasukan pada `HTTP BODY` dengan atribut `TEXT` dan `JSON`

```
{
  "firstname": "Mohammad",
  "lastname": "Nurdiansyah",
  "totalprice": 201,
  "depositpaid": true,
  "bookingdates":{
    "checkin": "2024-12-19",
    "checkout": "2025-12-19"
  },
  "additionalneeds": "Coffee"
}
```

Akan menghasilkan response code `200 OK` dan result akan menampilkan

```
{
  "firstname":"Mohammad",
  "lastname":"Nurdiansyah",
  "totalprice":200,
  "depositpaid":true,
  "bookingdates":{
    "checkin":"2024-12-19",
    "checkout":"2025-12-19"
  },
  "additionalneeds":"Coffee"
}

```

### PATCH PartialUpdateBooking
```
https://restful-booker.herokuapp.com/booking/3989
```
Untuk mengubah data user sebagian berdasar id nya\
Dengan memasukan pada `HTTP BODY` dengan atribut `TEXT` dan `JSON`
```
{
  "firstname": "Mohammad",
  "lastname": "Nurdiansyah"
}
```
Akan menghasilkan response code `200 OK` dan result
```
{
  "firstname":"Mohammad",
  "lastname":"Nurdiansyah",
  "totalprice":820,
  "depositpaid":true,
  "bookingdates":{
    "checkin":"2019-08-12",
    "checkout":"2024-09-01"
  }
}
```
### DELETE DeleteBooking
```
https://restful-booker.herokuapp.com/booking/3989
```
Untuk menghapus data user berdasrkan id\
Akan menghasilkan response code `201 Create` dan result

```
Created
```
## Ping
### GET HealthCheck
```
https://restful-booker.herokuapp.com/ping
```
Untuk dapat mengecek\
Akan menghasilkan response code `201 Create` dan result
```
Created
```

[LinkedIn](https://www.linkedin.com/in/mohammad-nurdiansyah-099b31151/) | [GitHub](https://github.com/nurdinsh)
