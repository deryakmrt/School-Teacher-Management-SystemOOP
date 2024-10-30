# Öğretmen Bilgi Sistemi

Bu Java projesi, bir lisede çalışan öğretmenleri yönetmek ve bilgilerini listelemek için geliştirilmiş bir öğretmen bilgi sistemi sunar. Proje, `Ogretmen`, `MatematikOgretmeni` ve `ResimOgretmeni` adında sınıflardan oluşmaktadır. Her öğretmenin özellikleri ve görev sürelerine göre tecrübe puanları hesaplanmakta ve öğretmenler belirli kriterlere göre sıralanabilmektedir.

## Sınıf Yapısı

### 1. Ogretmen Sınıfı

**Özellikler:**
- `Ad`, `Soyad`, `Yas`, `Brans`: Öğretmenin adı, soyadı, yaşı ve branşı.
- `ogretmenSayisi`: Okuldaki toplam öğretmen sayısını izleyen statik değişken.

**Metotlar:**
- `Ogretmen(String ad, String soyad, int yas)`: Öğretmenin adı, soyadı ve yaşını alarak `Ogretmen` nesnesi oluşturan yapıcı metot.
- `BilgileriYazdir()`: Öğretmen bilgilerini ekrana yazdırır.
- `OgretmenSayisiVer()`: Toplam öğretmen sayısını ekrana yazdırır. **`final`** anahtar kelimesi ile alt sınıflarda override edilmesi engellenmiştir.

### 2. MatematikOgretmeni Sınıfı

`Ogretmen` sınıfından türetilmiştir ve Matematik branşında çalışan öğretmenleri temsil eder.

**Özellikler:**
- `Id`: Öğretmenin kimliği, otomatik olarak artar.
- `gs`: Görev süresi (yıl cinsinden).
- `tp`: Tecrübe puanı, `gs * 0.4` formülü ile hesaplanır.

**Metotlar:**
- `MatematikOgretmeni(String ad, String soyad, int yas, int gs)`: Matematik öğretmeninin adı, soyadı, yaşı ve görev süresini alarak nesne oluşturan yapıcı metot. Branş otomatik olarak "Matematik" olarak atanır.
- `BilgileriYazdir()`: Öğretmenin Id, ad, soyad, yaş, branş ve tecrübe puanını ekrana yazdırır.

### 3. ResimOgretmeni Sınıfı

`Ogretmen` sınıfından türetilmiştir ve Resim branşında çalışan öğretmenleri temsil eder.

**Özellikler:**
- `Id`: Öğretmenin kimliği, otomatik olarak artar.
- `gs`: Görev süresi (yıl cinsinden).
- `tp`: Tecrübe puanı, `gs * 0.3` formülü ile hesaplanır.

**Metotlar:**
- `ResimOgretmeni(String ad, String soyad, int yas, int gs)`: Resim öğretmeninin adı, soyadı, yaşı ve görev süresini alarak nesne oluşturan yapıcı metot. Branş otomatik olarak "Resim" olarak atanır.
- `BilgileriYazdir()`: Öğretmenin Id, ad, soyad, yaş, branş ve tecrübe puanını ekrana yazdırır.

### 4. Anasayfa Sınıfı

Kullanıcıdan öğretmen sayısını ve bilgilerini alarak `MatematikOgretmeni` ve `ResimOgretmeni` nesneleri oluşturur, tüm öğretmenlerin bilgilerini listeler ve belirli özelliklere göre sıralama yapar.

**Özellikler:**
- Kullanıcıdan matematik ve resim öğretmenlerinin sayısını alır.
- Tüm öğretmen bilgilerini listeleme ve sıralama işlemlerini gerçekleştirir.

**Metotlar:**
- `OgretmenSirala(MatematikOgretmeni[] ogretmenler)`: Matematik öğretmenlerini tecrübe puanına göre büyükten küçüğe sıralar ve ekrana yazdırır.
- `OgretmenSirala(ResimOgretmeni[] ogretmenler)`: Resim öğretmenlerini tecrübe puanına göre büyükten küçüğe sıralar ve ekrana yazdırır.
- `bubbleSortByTP()`: Öğretmenleri tecrübe puanına göre sıralamak için kullanılan yardımcı bir metod.
------------------------------------------------------------------------------------------------------
# School Teacher Management System
This project represents a system for managing teachers at a high school, specifically focusing on **Math Teachers** and **Art Teachers** classes derived from a common **Teacher** superclass. The system provides functionalities such as displaying teacher information, counting total teachers, and sorting teachers by experience points (TP).

## Classes

### 1. `Teacher` Class
The `Teacher` class is a superclass representing the common properties of all teachers. It includes:
- **Fields**:
  - `String firstName`, `String lastName`, `int age`, `String branch`: Public fields representing basic information about the teacher.
  - `private static int teacherCount`: A private static field that tracks the total number of teachers.
- **Constructor**:
  - `public Teacher(String firstName, String lastName, int age)`: Initializes teacher information and increments the total teacher count.
- **Methods**:
  - `public void displayInfo()`: Prints the teacher's information.
  - `public static final void displayTeacherCount()`: Prints the total count of teachers. This method is `final`, preventing subclasses from overriding it.

### 2. `MathTeacher` Class
The `MathTeacher` class is a subclass of `Teacher`, adding specific fields and methods relevant to math teachers.
- **Fields**:
  - `private int Id`: Private field for unique identification of each teacher. The `Id` auto-increments for each new `MathTeacher` instance.
  - `public int experienceYears (gs)`: Represents the years of experience as a public field.
  - `public double experiencePoints (tp)`: Represents experience points, calculated based on the years of experience (multiplied by 0.4).
- **Constructor**:
  - `public MathTeacher(String firstName, String lastName, int age, int experienceYears)`: Initializes basic teacher info and calculates the experience points based on the years of experience.
- **Method Override**:
  - `@Override public void displayInfo()`: Displays all relevant information specific to a Math Teacher, including `Id`, `firstName`, `lastName`, `age`, `branch`, `experiencePoints`, and the class specialization.

### 3. `ArtTeacher` Class
The `ArtTeacher` class is a subclass of `Teacher`, focusing on fields and methods relevant to art teachers.
- **Fields**:
  - `private int Id`: Unique ID for each teacher, auto-incremented for each new `ArtTeacher` instance.
  - `public int experienceYears (gs)`: Represents the years of experience.
  - `public double experiencePoints (tp)`: Calculated by multiplying the years of experience by 0.3.
- **Constructor**:
  - `public ArtTeacher(String firstName, String lastName, int age, int experienceYears)`: Initializes the teacher's basic info and calculates experience points.
- **Method Override**:
  - `@Override public void displayInfo()`: Displays all relevant information specific to an Art Teacher, including `Id`, `firstName`, `lastName`, `age`, `branch`, `experiencePoints`, and the class specialization.

### 4. `MainPage` Class
The `MainPage` class serves as the main entry point of the program.
- **Functionality**:
  - Prompts the user to enter the number of math and art teachers and creates arrays for each type of teacher.
  - Fills each array by prompting for teacher details and creates respective instances for each teacher type.
  - **Method Calls**:
    - Displays the total teacher count using `Teacher.displayTeacherCount()`.
    - Lists details of all Math and Art teachers using the `displayInfo()` method from each class.
- **Sorting Methods**:
  - `public static void sortTeachers(MathTeacher[] teachers)`: Sorts an array of `MathTeacher` objects by `experiencePoints` in descending order.
  - `public static void sortTeachers(ArtTeacher[] teachers)`: Sorts an array of `ArtTeacher` objects by `experiencePoints` in descending order.
  
  The sorted lists of teachers are printed to the console.
