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
                new RecipesData("Fırında Kabak","İki adet kabak yıkanır ve kurulanıp kesilir. Kesilen kabaklar kekik, nane, pul biber, tuz ve zeytinyağı ile karıştırılıp 200 derece fırına atılır. Yoğurt ve sarımsak karıştırılır. Kabakların üzerine yoğurt gezdirilir.",R.drawable.firinda_kabak),
                new RecipesData("Brokoli Salatası","200 gram brokoli kesilir. Ardından suda pişirilir, soğutulur. Bir tencerede yoğurt, zeytinyağı, hardal, limon suyu ve tuz iyice çırpılır. Soğuyan brokoli tabağa alınır ve üzerine hazırlanan sos dökülüp karıştırılır.",R.drawable.brokli_salatasi),
                new RecipesData("Narlı Maş Fasulyesi Salatası","Önceden ıslatılan 1 bardak maş fasulyesi 10 dakika haşlanır.Fasulye soğutulur ve nar, tuz, zeytinyağı ve nar ekşisi ile karıştırılır. Üzerine ince kıyılmış dereotu serpilip servis edilir. ",R.drawable.narli_mas_fasulyesi_salatasi),
                new RecipesData("Semizotu Salatası","Yıkanıp ayıklanmış semizotu, ince yemeklik doğranmış kırmızı soğan, tuz, küp doğranmış domates ve salatalık bir kasede karıştırılıp tabağa alınır. Üzerine zeytinyağı ve limon suyu gezdirilir.",R.drawable.semizotu_salatasi),
                new RecipesData("Tulum Peynirli Karpuz Salatası","4 dilim  küp doğranmış karpuz, tulum peyniri ve yaban mersini aynı kapta karıştırılıp tabağa alınır. nane yaprakları  üzerlerine dizilir. 1 kaşık mavi haşhaş ve limon kabuğu rendesi üzerine serpilir.",R.drawable.tulum_peynirli_karpuz_salatasi),
                new RecipesData("Zeytinyağlı Brüksel Lahanası","Doğranan soğanlar ısıtılmış zeytinyağında kavrulur.İnce doğranmış havuçlar eklenir,5 dakika  kavrulur. 500 gram Brüksel lahanası ile tuz ve bal eklenip karıştırılır.Sebzeler yumuşayınca servis edilir.",R.drawable.brokli_salatasi),

        };

        RecipesAdapter recipesAdapter = new RecipesAdapter(recipesData,RecipesActivity.this);
        recyclerView.setAdapter(recipesAdapter);


    }
}
