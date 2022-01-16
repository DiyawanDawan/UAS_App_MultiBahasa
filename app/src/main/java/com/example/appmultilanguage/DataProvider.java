package com.example.appmultilanguage;

import android.content.Context;

import com.example.appmultilanguage.model.*;

import java.util.ArrayList;
import java.util.List;

public class DataProvider {
    private static List<Masakan> masakans = new ArrayList<>();

    private static List<Coktail> initCoktail(Context ctx) {
        List<Coktail> coktails = new ArrayList<>();
        coktails.add(new Coktail(ctx.getString(R.string.name_dark), ctx.getString(R.string.bahan_dark), ctx.getString(R.string.des_dark), R.drawable.c_dark_and_stormy));
        coktails.add(new Coktail(ctx.getString(R.string.name_French_75), ctx.getString(R.string.bahan_French_75), ctx.getString(R.string.des_French_75), R.drawable.c_french_75));
        coktails.add(new Coktail(ctx.getString(R.string.name_Boulevardier), ctx.getString(R.string.bahan_Boulevardier), ctx.getString(R.string.des_Boulevardier), R.drawable.c_boulevardier));
        coktails.add(new Coktail(ctx.getString(R.string.name_body_mary), ctx.getString(R.string.bahan_body_mary), ctx.getString(R.string.des_body_mary), R.drawable.c_bloody_mary));
        coktails.add(new Coktail(ctx.getString(R.string.name_gimlate), ctx.getString(R.string.bahan__gimlate), ctx.getString(R.string.cm__gimlate), R.drawable.c_gimlet));
        coktails.add(new Coktail(ctx.getString(R.string.name_gimlate), ctx.getString(R.string.bh_gimlate), ctx.getString(R.string.cm_moscow_mule), R.drawable.c_moscow_mule));
        coktails.add(new Coktail(ctx.getString(R.string.nm_Aperol_Spritz), ctx.getString(R.string.bh_Aperol_Spritz), ctx.getString(R.string.cm_Aperol_Spritz), R.drawable.c_aperol_spritz));
        coktails.add(new Coktail(ctx.getString(R.string.nm_mojito), ctx.getString(R.string.bh_mojito), ctx.getString(R.string.cm_mojito), R.drawable.c_mojito));
        coktails.add(new Coktail(ctx.getString(R.string.nm_Margarita), ctx.getString(R.string.bh_Margarita), ctx.getString(R.string.cm_Margarita), R.drawable.c_margarita));
        coktails.add(new Coktail(ctx.getString(R.string.nm_Whiskey_Sour), ctx.getString(R.string.bh_Whiskey_Sour), ctx.getString(R.string.cm_Whiskey_Sour), R.drawable.c_whiskey_sour));
        return coktails;
    }

    private static List<Mocktail> initMocktail(Context ctx) {
        List<Mocktail> mocktails = new ArrayList<>();
        mocktails.add(new Mocktail(ctx.getString(R.string.nm_bulebery_mojito), ctx.getString(R.string.bg_bulebery_mojito), ctx.getString(R.string.cm_bulebery_mojito), R.drawable.m_blueberry_mojito));
        mocktails.add(new Mocktail(ctx.getString(R.string.nm_nice_pear), ctx.getString(R.string.bh_nice_pear), ctx.getString(R.string.cm__nice_pear), R.drawable.m_nice_pear));
        mocktails.add(new Mocktail(ctx.getString(R.string.nm_pinepple_corbbler), ctx.getString(R.string.bh_pinepple_corbbler), ctx.getString(R.string.cm__pinepple_corbbler), R.drawable.m_pineapple_cobbler));
        mocktails.add(new Mocktail(ctx.getString(R.string.cm_holidy_sherly), ctx.getString(R.string.bh_holidy_sherly), ctx.getString(R.string.cm__holidy_sherly), R.drawable.m_holayday_shirly));
        mocktails.add(new Mocktail(ctx.getString(R.string.nm_Virgin_Watermelon_Margarita), ctx.getString(R.string.bh_Virgin_Watermelon_Margarita), ctx.getString(R.string.cm_Virgin_Watermelon_Margarita), R.drawable.m_virgin_watermelon_margarita));
        return mocktails;
    }

    private static List<Indonesian_Food> initIndonesianFoos(Context ctx) {
        List<Indonesian_Food> indonesian_foods = new ArrayList<>();
        indonesian_foods.add(new Indonesian_Food(ctx.getString(R.string.nm_Rendang), ctx.getString(R.string.bh_Rendang), ctx.getString(R.string.cm_Rendang), R.drawable.i_rendang));
        indonesian_foods.add(new Indonesian_Food(ctx.getString(R.string.nm_Rawon), ctx.getString(R.string.bh_Rawon), ctx.getString(R.string.cm_Rawon), R.drawable.i_rawon));
        indonesian_foods.add(new Indonesian_Food(ctx.getString(R.string.nm_Sate), ctx.getString(R.string.bh_Sate), ctx.getString(R.string.cm_Sate), R.drawable.i_sate));
        indonesian_foods.add(new Indonesian_Food(ctx.getString(R.string.nm_Tahu_Bacam), ctx.getString(R.string.bh_Tahu_Bacam), ctx.getString(R.string.cm_Tahu_Bacam), R.drawable.i_tahu_bacam));
        indonesian_foods.add(new Indonesian_Food(ctx.getString(R.string.nm_Soto_Ayam), ctx.getString(R.string.bh_Soto_Ayam), ctx.getString(R.string.cm__Soto_Ayam), R.drawable.i_soto_ayam));
        indonesian_foods.add(new Indonesian_Food(ctx.getString(R.string.nm_sop_Buntut), ctx.getString(R.string.bh_sop_Buntut), ctx.getString(R.string.cm_sop_Buntut), R.drawable.i_sop_buntut));
        indonesian_foods.add(new Indonesian_Food(ctx.getString(R.string.nm_Mie_Goreng), ctx.getString(R.string.bh_Mie_Goreng), ctx.getString(R.string.cm_Mie_Goreng), R.drawable.i_mie_goreng));
        indonesian_foods.add(new Indonesian_Food(ctx.getString(R.string.nm_Ayam_Goreng), ctx.getString(R.string.bh_Ayam_Goreng), ctx.getString(R.string.cm_Ayam_Goreng), R.drawable.i_ayam_goreng));
        indonesian_foods.add(new Indonesian_Food(ctx.getString(R.string.nm_Ayam_Panggang), ctx.getString(R.string.bh_Ayam_Panggang), ctx.getString(R.string.cm__Ayam_Panggang), R.drawable.i_ayam_panggang_merah));
        indonesian_foods.add(new Indonesian_Food(ctx.getString(R.string.nm_Nasi_Goreng), ctx.getString(R.string.bh_Nasi_Goreng), ctx.getString(R.string.cm_Nasi_Goreng), R.drawable.i_nasi_goreng));
        return indonesian_foods;
    }
    private static List<Timur_Tengah_Food> iniTimurTengahFood(Context ctx) {
        List<Timur_Tengah_Food> timur_tengah_foods = new ArrayList<>();
        timur_tengah_foods.add(new Timur_Tengah_Food(ctx.getString(R.string.nm_Samosa), ctx.getString(R.string.bh_Samosa), ctx.getString(R.string.cm_Samosa), R.drawable.t_samosa));
        timur_tengah_foods.add(new Timur_Tengah_Food(ctx.getString(R.string.nm_Chea_Tea), ctx.getString(R.string.bh__Chea_Tea), ctx.getString(R.string.cm_Chea_Tea), R.drawable.t_chis_tea));
        timur_tengah_foods.add(new Timur_Tengah_Food(ctx.getString(R.string.nm_Roti_Khubz), ctx.getString(R.string.bh_Roti_Khubz), ctx.getString(R.string.cm_Roti_Khubz), R.drawable.t_roti_khubz));
        timur_tengah_foods.add(new Timur_Tengah_Food(ctx.getString(R.string.nm_Kofta), ctx.getString(R.string.bh_Kofta), ctx.getString(R.string.cm_Kofta), R.drawable.t_kofta));
        timur_tengah_foods.add(new Timur_Tengah_Food(ctx.getString(R.string.nm_Nasi_Kebuli), ctx.getString(R.string.bh_Nasi_Kebuli), ctx.getString(R.string.cm_Nasi_Kebuli), R.drawable.t_nasi_kebuli));
        timur_tengah_foods.add(new Timur_Tengah_Food(ctx.getString(R.string.nm_Nasi_Buyani), ctx.getString(R.string.bh_Nasi_Buyani), ctx.getString(R.string.cm_Nasi_Buyani), R.drawable.nasi_biryani));
        return timur_tengah_foods;
    }
    private static List<Westren_Food> iniWestrenFood(Context ctx) {
        List<Westren_Food> westren_foods = new ArrayList<>();
        westren_foods.add(new Westren_Food(ctx.getString(R.string.nm_Lemon_heard), ctx.getString(R.string.bh_Lemon_heard), ctx.getString(R.string.cm_Lemon_heard), R.drawable.w_lemon_herp));
        westren_foods.add(new Westren_Food(ctx.getString(R.string.nm_Sopo_Tahu), ctx.getString(R.string.bh_Sopo_Tahu), ctx.getString(R.string.cm_Sopo_Tahu), R.drawable.w_sopo_tahu));
        westren_foods.add(new Westren_Food(ctx.getString(R.string.nm_French_toast), ctx.getString(R.string.bh_French_toast), ctx.getString(R.string.cm_French_toast), R.drawable.w_french_tost));
        westren_foods.add(new Westren_Food(ctx.getString(R.string.nm_Chisken_Cordeb_Blue), ctx.getString(R.string.bh_Chisken_Cordeb_Blue), ctx.getString(R.string.cm_Chisken_Cordeb_Blue), R.drawable.chicken_cardob_blue));
        westren_foods.add(new Westren_Food(ctx.getString(R.string.nm_Garden_veggie_chickpea_sandwich), ctx.getString(R.string.bh_Garden_veggie_chickpea_sandwich), ctx.getString(R.string.cm_Garden_veggie_chickpea_sandwich), R.drawable.w_garden_veggie_chickpea_sandwich));
        westren_foods.add(new Westren_Food(ctx.getString(R.string.nm_Rosemary_chicken_with_sauteed_vegetables), ctx.getString(R.string.bh_Rosemary_chicken_with_sauteed_vegetables), ctx.getString(R.string.cm_Rosemary_chicken_with_sauteed_vegetables), R.drawable.w_rosemary_chicken_with_sauteed_vegetables));
        westren_foods.add(new Westren_Food(ctx.getString(R.string.nm_Spicy_tuna_roll), ctx.getString(R.string.bh_Spicy_tuna_roll), ctx.getString(R.string.cm_Spicy_tuna_roll), R.drawable.w_spicy_tuna_roll));
        westren_foods.add(new Westren_Food(ctx.getString(R.string.nm_Chickpea_salad_with_lemon), ctx.getString(R.string.bh_Chickpea_salad_with_lemon), ctx.getString(R.string.cm_Chickpea_salad_with_lemon), R.drawable.w_chicpea_salad_widt_lemon_tuna_and_olives));
        westren_foods.add(new Westren_Food(ctx.getString(R.string.nm_Sun_dried_tomato_basil_pasta), ctx.getString(R.string.bh_Sun_dried_tomato_basil_pasta), ctx.getString(R.string.cm_Sun_dried_tomato_basil_pasta), R.drawable.w_sun_dried_tomato_basil_pasta));
        westren_foods.add(new Westren_Food(ctx.getString(R.string.nm_Spanish_chickpea_and_spinach_stew), ctx.getString(R.string.bh_Spanish_chickpea_and_spinach_stew), ctx.getString(R.string.cm_Spanish_chickpea_and_spinach_stew), R.drawable.w_spanish_chickpea_and_spinach_stew));
        return westren_foods;
    }

    private static void initAllMasakan(Context ctx) {
        masakans.addAll(initCoktail(ctx));
        masakans.addAll(initMocktail(ctx));
        masakans.addAll(initIndonesianFoos(ctx));
        masakans.addAll(iniTimurTengahFood(ctx));
        masakans.addAll(iniWestrenFood(ctx));
    }

    public static List<Masakan> getMasakansByTipe(Context ctx, String jenis) {
        List<Masakan> masakansByType = new ArrayList<>();
        if (masakans.size() == 0) {
            initAllMasakan(ctx);
        }
        for (Masakan h : masakans) {
            if (h.getMasakan().equals(jenis)) {
                masakansByType.add(h);
            }
        }
        return masakansByType;
    }
}
