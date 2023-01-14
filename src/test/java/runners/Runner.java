package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        // cucumber'da rapor almak için
        plugin={"html:target/cucumber-reports-smoke.html",
                "json:target/json-reports/cucumber1.json",
                "junit:target/xml-report/cucumber1.xml"},
        // features ile entegre etmek için
        features = "src/test/resources/features",
        // stepdefinitions ile yapıştırdık
        glue = "stepdefinitions" ,
        // work in progress tag ile istediğimiz feature file çalıştırılır
        tags = "@wip",
        dryRun = false
)

public class Runner {

    /*
        Cucumber'da runner class'ı boş bir class'tır
        Runner class'ını diğer class'lardan farklı kılan
        ve TestNG'deki xml dosyları gibi çalışmasını sağlayan
        2 adet notasyon mevcuttur.

        @RunWith notasyonu projemize cucumber junit dependency eklememizin sebebiydi
        bu sayede runner class'larımız cucumbe rile çalışır

        @CucumberOptions notasyonu ile istediğimiz özellikleri Runner class'ına ekleyebiliriz.
        Raporlama gibi ekstra opsiyonları da ileride ekleyeceğiz
        Ancak
        öcnelikli görevi feature dosyaları ile stepdefinitions'da bulunan Java method'larını
        ilişiklendirmektir.

        tags : @wip features directory içerisinde yazılan tag'leri aratup
        buldugu tüm feature veya scenario'ları çalıştırır

        dryRun = true  ya da false olarak 2 değer alabilir

                true seçilirse, verilen tag ile işaretli olan Feature veya Scenario'daki eksik
                stepdefinitions'ları bulup ilgili method'ları oluşturur.
                Hiç bir şekilde testimizi çalıştırmaz
                eksik adım yoksa test PASSED oalrak işaretler

        dryRun = false seçilirse, verilen tag ile işaretlenen
                 Feature veya Scenario'ları calıstırır.
    */


}
