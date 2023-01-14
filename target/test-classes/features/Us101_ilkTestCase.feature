
@wip
Feature: US101 kullanıcı demoqa sitesinde test yapar

  Scenario: TC01 kullanici demoqa sitesinde alert'in görünürlüğünü test eder

    Given kullanici "demoUrl" sayfa gider
    Then Alerts'e tiklar
    Then On button click, alert will appear after bes seconds karsisindaki click me butonuna basin
    Then Alert’in gorunur olmasini bekleyin
    Then Alert uzerindeki yazinin “This alert appeared after bes seconds” oldugunu test edin
    Then Ok diyerek alerti kapatin
    And Sayfayi kapatin