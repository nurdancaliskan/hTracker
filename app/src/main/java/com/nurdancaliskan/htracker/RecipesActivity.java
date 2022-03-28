package com.nurdancaliskan.htracker;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class RecipesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipes);

        RecyclerView recyclerView = findViewById(R.id.recyclerView_recipes);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        RecipesData[] recipesData = new RecipesData[] {
                new RecipesData("Fırında Kabak","İki adet kabak yıkanır ve kurulanıp 3-4 cm kalınlığında yuvarlak halde kesilir. Kesilen kabaklar kekik, nane, pul biber, tuz ve zeytinyağı ile karıştırılıp 200 derece fırına atılır. Yoğurt ve ezilmiş sarımsak iyice karıştırılır. Fırından hafif kızarmış ve yumuşamış kabaklar çıkartılıp tabağa alınır. Kabakların üzerine sarımsaklı yoğurt gezdirilir ve ince doğranmış semizotu serpilir.",R.drawable.firinda_kabak),
                new RecipesData("Brokoli Salatası","200 gram brokoli çiçekleri düzenli şekilde dağıtılmadan kesilir ve yıkanır. Ardından suda veya buharda yumuşayıncaya dek pişirilir, soğutulur. Bir tencerede yoğurt, zeytinyağı, hardal, limon suyu ve tuz iyice çırpılır. Soğuyan brokoli tabağa alınır ve üzerine hazırlanan sos dökülüp karıştırılır. Taze soğan ince şekilde doğranır ve mısır ile beraber üzerine serpilir.",R.drawable.brokli_salatasi),
                new RecipesData("Narlı Maş Fasulyesi Salatası"," 1 gece önceden ıslatılan 1 su bardağı maş fasulyesi 10-15 dakika arası haşlanır. Haşlanan maş fasulyesi soğutulur ve nar, tuz, zeytinyağı ve nar ekşisi ile karıştırılır. Üzerine ince kıyılmış dereotu serpilip servis edilir. ",R.drawable.narli_mas_fasulyesi_salatasi),
                new RecipesData("Semizotu Salatası","Yıkanıp ayıklanmış semizotu, ince yemeklik doğranmış kırmızı soğan, tuz, küp doğranmış domates ve salatalık bir kasede karıştırılıp tabağa alınır. Üzerine zeytinyağı ve limon suyu gezdirilir.",R.drawable.semizotu_salatasi),
                new RecipesData("Tulum Peynirli Karpuz Salatası","4 dilim  küp doğranmış karpuz, tulum peyniri ve yaban mersini aynı kapta nazikçe karıştırılıp tabağa alınır. Ayıklanıp yıkanmış ve kurutulmuş nane yaprakları karışık şekilde üzerlerine dizilir. 1 tatlı kaşığı mavi haşhaş yüzeye yayılacak şekilde serpilir. Son olarak limon kabuğu rendesi de üzerine serpilir ve servis edilir.",R.drawable.tulum_peynirli_karpuz_salatasi),
                new RecipesData("Zeytinyağlı Brüksel Lahanası","Yemeklik doğranan soğanlar ısıtılmış zeytinyağında sararana dek kavrulur. Soğanlar sarardığında ince yemeklik doğranmış havuçlar eklenir ve 5 dakika daha kavrulur. 500 gram Brüksel lahanası ile beraber tuz ve bal da ilave edilip biraz daha karıştırılır. Sıcak su ilave edilir ve sebzeler yumuşayınca servis edilir.",R.drawable.brokli_salatasi),

        };

        RecipesAdapter recipesAdapter = new RecipesAdapter(recipesData,RecipesActivity.this);
        recyclerView.setAdapter(recipesAdapter);


    }
}
