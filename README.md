## Human Resources Management System

#### Aynı Projeyi geliştiriyoruz,
-------------------------------------------------------------------------------------------------------------------------------------------
### Engin Demiroğ Java Kamp 9. Gün Ödev

#### Yapılanlar;
* CurriculumVitae nesnesi oluşturuldu ve istenilen aday bilgileri içina ayrı ayrı nesneler oluştururularak code first tekniği ile datebase şekillendirildi.
* Cloudinary entegre edildi.


#### Ödev içeriği;
**Req 12**: Adaylar sisteme CV girişi yapabilmelidir.

* Adaylar okudukları okulları sisteme ekleyebilmelidir. (Okul adı, bölüm)
* Bu okullarda hangi yıllarda okuduklarını sisteme girebilmelidir.
* Eğer mezun değilse mezuniyet yılı boş geçilebilmelidir.
* Adayların okudukları okullar mezuniyet yılına göre tersten sıralanabilmelidir. Mezun olunmamışsa yine bu okul en üstte ve "devam ediyor" olarak görüntülenmelidir.
* Adaylar iş tecübelerini girebilmelidir. (İş yeri adı, pozisyon)
* Bu tecrübelerini hangi yıllarda yaptıklarını sisteme girebilmelidir.
* Eğer hala çalışıyorsa işten ayrılma yılı boş geçilebilmelidir.
* Adayların tecrübeleri yıla göre tersten sıralanabilmelidir. Hala çalışıyorsa yine bu tecrübesi en üstte ve "devam ediyor" olarak görüntülenmelidir.
* Adaylar bildikleri yabancı dilleri sisteme girebilmelidir. ( Dil, Seviye -> 1-5)
* Adaylar sisteme fotoğraf girebilmelidir. Adaya ait fotoğraf https://cloudinary.com/pricing sisteminde tutulacaktır. (Dış servis entegrasyonu) Ücretsiz hesabı kullanınız.
* Adaylar sisteme github adreslerini girebilmelidir.
* Adaylar sisteme linkedin adreslerini girebilmelidir.
* Adaylar bildikleri programlama dillerini veya teknolojilerini sisteme girebilmelidir. (Programlama/Teknoloji adı) Örneğin; React
* Adaylar sisteme ön yazı ekleyebilmelidir. (Örneğin: Çalışmayı çok severim....)

-------------------------------------------------------------------------------------------------------------------------------------------
### Engin Demiroğ Java Kamp 8. Gün Ödev

#### Yapılanlar;
* İş ilanları için JobAdvertisement nesnesi ve database deki karşılığı oluşturuldu. 
* Cities ve jobPosition nesneleri OneToMany ilişkileri oluşturuldu.
* İstenildiği gibi get metodları yazıldı. Dataya örnek veri eklendi.

#### Ödev içeriği;
**Önemli : Bu isterler backend-frontend ayırımı yapılmaksızın yazılmıştır. (Sektördeki gibi). Siz backend için gerekli kısımları kodlamalısınız.**

**Req 7** : İş verenler sisteme iş ilanı ekleyebilmelidir.
**İş ilanı formunda;**
* Seçilebilir listeden (dropdown) genel iş pozisyonu seçilebilmelidir.(Örneğin Java Developer)(Zorunlu)
* İş tanımı girişi yapılabilmelidir. (Örneğin; firmamız için JAVA, C# vb. dillere hakim....)(Zorunlu)
* Şehir bilgisi açılır listeden seçilebilmelidir. (Zorunlu)
* Maaş skalası için min-max girişi yapılabilmelidir. (Opsiyonel)
* Açık pozisyon adedi girişi yapılabilmelidir. (Zorunlu)
* Son başvuru tarihi girişi yapılabilmelidir.

**Req 8** : Sistemdeki tüm aktif iş ilanları listelenebilmelidir.
* Liste, tablo formunda gelmelidir.
* Listede firmadı, genel iş pozisyonu adı, açık pozisyon adedi, yayın tarihi, son başvuru tarihi bilgileri olmalıdır.

**Req 9** : Sistemdeki tüm aktif iş ilanları tarihe göre listelenebilmelidir.
* Liste, tablo formunda gelmelidir.
* Listede firmadı, genel iş pozisyonu adı, açık pozisyon adedi, yayın tarihi, son başvuru tarihi bilgileri olmalıdır.

**Req 10** : Sistemde bir firmaya ait tüm aktif iş ilanları listelenebilmelidir.
* Liste, tablo formunda gelmelidir.
* Listede firmadı, genel iş pozisyonu adı, açık pozisyon adedi, yayın tarihi, son başvuru tarihi bilgileri olmalıdır.

**Req 11** : İş verenler sistemdeki bir ilanı kapatabilmelidir. (Pasif ilan)

-------------------------------------------------------------------------------------------------------------------------------------------
### Engin Demiroğ Java Kamp 7. Gün Ödev

#### Yapılanlar;
* Swagger desteği eklendi
* İş arayan, İş veren ve Sistem personeli nesnelerinin ortak özellikleri olası sebebiyle User nesnesinden extend edilerek OneToOne ilişki ile map edildi.
* Belirtilen koşullara göre İş Arayan, İş Veren ve Sistem Genel iş poziyonları ekleme işlemleri yazıldı.
* Validasyon işlemi için Spring Boot Validation kullanıldı.
* İş verenler, İş arayanlar ve İş pozisyonları tümü listelenebilir getAll metotları yazıldı.

#### Ödev içeriği;
* Sisteminize Swagger desteği getiriniz.

Daha önce modellemesini yaptığınız aşağıdaki gereksinimleri koda dökünüz.
**ÖNEMLİ 1 : Doğrulama işlemleri için sahte servisler oluşturunuz. Örneğin, gerçekten mail göndermeniz gerekmez.
ÖNEMLİ 2 : Gereksinimler dışında kodlama yapmayınız. Bu, Proje yönetimi ve ALM (Application LifeCycle Management) kurallarına aykırı bir yazılım geliştirici davranışıdır.**

**Req 1** : İş Arayanlar sisteme kayıt olabilmelidir.

Kabul Kriterleri:

* Kayıt sırasında kullanıcıdan ad, soyad, tcno, doğum yılı, e-Posta, şifre, şifre tekrarı bilgileri istenir.
* Tüm alanlar zorunludur. Kullanıcı bilgilendirilir.
* Mernis doğrulaması yapılarak sisteme kayıt gerçekleştirilir.
* Doğrulama geçerli değilse kullanıcı bilgilendirilir.
* Daha önce kayıtlı bir e-posta veya tcno var ise kayıt gerçekleşmez. Kullanıcı bilgilendirilir.
* Kayıdın gerçekleşmesi için e-posta doğrulaması gerekir.

**Req 2** : İş verenler sisteme kayıt olabilmelidir.

Kabul Kriterleri:

* Kayıt sırasında kullanıcıdan şirket adı, web sitesi, web sitesi ile aynı domaine sahip e-posta, telefon, şifre, şifre tekrarı bilgileri istenir. Burada amaç sisteme şirket olmayanların katılmasını engellemektir.
* Tüm alanlar zorunludur. Kullanıcı bilgilendirilir.
* Şirket kayıtları iki şekilde doğrulanır. Kayıdın gerçekleşmesi için e-posta doğrulaması gerekir. HRMS personelinin (bizim :)) onayı gerekmektedir.
* Daha önce kayıtlı bir e-posta var ise kayıt gerçekleşmez. Kullanıcı bilgilendirilir.

**Req 3** : Sisteme genel iş pozisyonu isimleri eklenebilmelidir. Örneğin Software Developer, Software Architect.

Kabul Kriterleri:

* Bu pozisyonlar tekrar edemez. Kullanıcı uyarılır.

**Req 4** : İş verenler listelenebilmelidir. (Sadece tüm liste)

**Req 5** : İş arayanlar listelenebilmelidir. (Sadece tüm liste)

**Req 6** : İş pozisyonları listelenebilmelidir. (Sadece tüm liste)

-------------------------------------------------------------------------------------------------------------------------------------------
### Engin Demiroğ Java Kamp 6. Gün Ödev

#### Yapılanlar;
* Spring Boot ile proje oluşturuldu.
* PostgreSQL de kullanılabilecek istenen modelleme yapıldı.
* databaseSchema içine ERD Project cinsinde kayıt oluşturuldu.
* Genel iş pozisyonunda listelenecek api yazıldı

#### Ödev içeriği;

Bugün HRMS sistemimize başlıyoruz.
Aşağıdaki isterlere göre veri tabanı modellemesi yapınız. (Araştırma: PostgreSql'de tablo ve kolon ekleme) Veritabanı isminiz hrms olabilir.
Sistemimiz üç temel kullanıcı türüne sahiptir. Sistem personeli, İş Arayanlar ve İş verenler. Sistem personeli : Projenizde çalışan kişiler. Örneğin Kariyer.Net personeli.

**ÖNEMLİ : Burada ilk etapta veri tabanı modeli istiyorum. Kod yazmanızı istemiyorum.**

**Req 1** : İş Arayanlar sisteme kayıt olabilmelidir.

Kabul Kriterleri:

* Kayıt sırasında kullanıcıdan ad, soyad, tcno, doğum yılı, e-Posta, şifre, şifre tekrarı bilgileri istenir.
* Tüm alanlar zorunludur. Kullanıcı bilgilendirilir.
* Mernis doğrulaması yapılarak sisteme kayıt gerçekleştirilir.
* Doğrulama geçerli değilse kullanıcı bilgilendirilir.
* Daha önce kayıtlı bir e-posta veya tcno var ise kayıt gerçekleşmez. Kullanıcı bilgilendirilir.
* Kayıdın gerçekleşmesi için e-posta doğrulaması gerekir.

**Req 2** : İş verenler sisteme kayıt olabilmelidir.

Kabul Kriterleri:

* Kayıt sırasında kullanıcıdan şirket adı, web sitesi, web sitesi ile aynı domaine sahip e-posta, telefon, şifre, şifre tekrarı bilgileri istenir. Burada amaç sisteme şirket olmayanların katılmasını engellemektir.
* Tüm alanlar zorunludur. Kullanıcı bilgilendirilir.
* Şirket kayıtları iki şekilde doğrulanır. Kayıdın gerçekleşmesi için e-posta doğrulaması gerekir. HRMS personelinin (bizim :)) onayı gerekmektedir.
* Daha önce kayıtlı bir e-posta var ise kayıt gerçekleşmez. Kullanıcı bilgilendirilir.

**Req 3** : Sisteme genel iş pozisyonu isimleri eklenebilmelidir. Örneğin Software Developer, Software Architect.

Kabul Kriterleri:

* Bu pozisyonlar tekrar edemez. Kullanıcı uyarılır.
