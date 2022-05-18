@automationpractice
Feature: Automation Practice Calisma
  Background: Automation Practice Background
    Given kullanici tarayici acip automationpractice sayfasina gider

  @yeniKullaniciOlusturma
  Scenario: Automation Practice Yeni Kullanici Olusturma
    Given kullanici sign in butonuna tiklar
    And kullanici gecerli bir email adresiyle ilerler
    When kullanici istenilen bilgileri girip yeni kullanici olusturur
    Then kullanici yeni kullanici olusturdugunu dogrular

  @sepeteUrunEklemeSatinAlma
  Scenario: Automation Practice Sepete Urun Ekleme
    Given kullanici dresses ve summer dresses menusunden sepete urun ekler
    When kullanici "summer" ürünü aratip sepete ekler
    Then kullanici cart ve checkout menusunden sepete gidip urunleri dogrular
    And kullanici sepeti dogrulayip address adimina ilerler
    And kullanici address secip shipping adimina ilerler
    And kullanici kargo ve hizmet sartlarini kabul edip payment adimina ilerler
    When kullanici payment adiminda odeme yontemi secip siparisi tamamlar
    Then kullanici siparisini account ve order history adimlariyla dogrular
