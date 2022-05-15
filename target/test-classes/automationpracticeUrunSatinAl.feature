@automationpractice
Feature: Automation Practice Calisma

  @yeniKullaniciOlusturma
  Scenario: Automation Practice Yeni Kullanici Olusturma
    Given kullanici tarayici acip automationpractice sayfasina gider
    And kullanici sign in butonuna tiklar
    And kullanici gecerli bir email adresiyle ilerler
    When kullanici istenilen bilgileri girip yeni kullanici olusturur
    Then kullanici yeni kullanici olusturdugunu dogrular

  @sepeteUrunEkleme
  Scenario: Automation Practice Sepete Urun Ekleme
    Given kullanici dresses ve summer dresses menusunden sepete urun ekler
    When kullanici "summer" ürünü aratip sepete ekler
    Then kullanici cart ve checkout menusunden sepete gidip urunleri dogrular

  @urunSatinAlma
  Scenario: Automation Practice Sepete Urun Ekleme



