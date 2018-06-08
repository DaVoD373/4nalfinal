package ir.charnal.davod.cityholderofiran;

/**
 * Created by DaVoD on 12/29/2017.
 */

public class CityOfIranHolder {
   public static final String KHORASAN_RAZAVI = "خراسان رضوی";
   public static final String KHORASAN_SHOMALI = "خراسان شمالی";
   public static final String KHORASAN_JONUBI = "خراسان جنوبی";
   public static final String AZARBAIEJAN_GHARBI = "آذربایجان غربی";
   public static final String AZARBAIEJAN_SHARGHI = "آذربایجان شرقی";
   public static final String TEHRAN = "تهران";
   public static final String GHOM = "قم";
   public static final String ALBORZ = "البرز";
   public static final String SEMNAN = "سمنان";
   public static final String KERMANSHAH = "کرمانشاه";
   public static final String HAMEDAN = "همدان";
   public static final String KERMAN = "کرمان";
   public static final String KHUZESTAN = "خوزستان";
   public static final String GOLESTAN = "گلستان";
   public static final String MAZANDARAN = "مازندران";
   public static final String GILAN = "گیلان";
   public static final String SISTAN_BALUCHESTAN = "سیستان و بلوچستان";
   public static final String KOHKILUIE_BOIERAHMAD = "کهکیلویه و بویراحمد";
   public static final String CHAHARMAHAL_BAKHTIARI = "چهارمحال بختیاری";
   public static final String BUSHEHR = "بوشهر";
   public static final String FARS = "فارس";
   public static final String MARKAZI = "مرکزی";
   public static final String ESFEHAN = "اصفهان";
   public static final String ARDEBIL = "اردبیل";
   public static final String GHAZVIN = "قزوین";
   public static final String ZANJAN = "زنجان";
   public static final String YAZD = "اراک";
   public static final String ILAM = "ایلام";
   public static final String KORDESTAN = "کردستان";
   public static final String LORESTAN = "لرستان";
   public static final String HORMOZGAN = "هرمزگان";

   private static String[] cities ;
   private static String[] province;

   public static String[] getProvince(){
       province = new String[]{AZARBAIEJAN_SHARGHI,AZARBAIEJAN_GHARBI,ARDEBIL,ESFEHAN,ALBORZ,ILAM,BUSHEHR,TEHRAN,CHAHARMAHAL_BAKHTIARI,
                                KHORASAN_JONUBI,KHORASAN_RAZAVI,KHORASAN_SHOMALI,KHUZESTAN,ZANJAN,SEMNAN,
                                SISTAN_BALUCHESTAN,FARS,GHAZVIN,GHOM,KORDESTAN,KERMAN,KERMANSHAH,KOHKILUIE_BOIERAHMAD,GOLESTAN,
                                GILAN,LORESTAN,MAZANDARAN,MARKAZI,HORMOZGAN,HAMEDAN,YAZD};
       return province;
   }

   public static String[] getCity(String province){

       switch (province){
           case KHORASAN_RAZAVI:
                cities = new String[]{"بجستان", "بردسكن", "تايباد", "تربت جام", "تربت حيدريه", "جغتای", "جوین", "چناران", "خلیل آباد", "خواف", "درگز", "رشتخوار", "سبزوار", "سرخس", "طبس", "طرقبه", "فريمان", "قوچان", "كاشمر", "كلات", "گناباد", "مشهد", "نيشابور"};
               break;
           case KHORASAN_JONUBI:
                cities = new String[]{"آشخانه، مانه و سمرقان", "اسفراين", "بجنورد", "جاجرم", "شيروان", "فاروج"};
               break;
           case KHORASAN_SHOMALI:
                cities = new String[]{"بشرویه", "بيرجند", "خضری", "خوسف", "سرایان", "سربيشه", "طبس", "فردوس", "قائن", "نهبندان"};
               break;
           case ALBORZ:
                cities = new String[]{"آسارا", "اشتهارد", "شهر جديد هشتگرد", "طالقان", "كرج", "گلستان تهران", "نظرآباد", "هشتگرد"};
               break;
           case GHAZVIN:
                cities = new String[]{"آبيك", "البرز", "بوئين زهرا", "تاكستان", "قزوين", "محمود آباد نمونه"};
               break;
           case TEHRAN:
                cities = new String[]{"اسلامشهر", "بومهن", "پاكدشت", "تهران", "چهاردانگه", "دماوند", "رودهن", "ري", "شريف آباد", "شهر رباط كريم", "شهر شهريار", "فشم", "فيروزكوه", "قدس", "كهريزك", "لواسان بزرگ", "ملارد", "ورامين"};
               break;
           case KERMAN:
                cities = new String[]{"بابك", "بافت", "بردسير", "بم", "جيرفت", "راور", "رفسنجان", "زرند", "سيرجان", "كرمان", "كهنوج", "منوجان"};
               break;
           case KERMANSHAH:
                cities = new String[]{"اسلام آباد غرب", "پاوه", "تازه آباد- ثلاث باباجانی", "جوانرود", "سر پل ذهاب", "سنقر كليائي", "صحنه", "قصر شيرين", "كرمانشاه", "كنگاور", "گيلان غرب", "هرسين"};
               break;
           case MARKAZI:
                cities = new String[]{"آشتيان", "اراك", "تفرش", "خمين", "دليجان", "ساوه", "شازند", "محلات", "کمیجان"};
               break;
           case MAZANDARAN:
                cities = new String[]{"آمل", "بابل", "بابلسر", "بلده", "بهشهر", "پل سفيد", "تنكابن", "جويبار", "چالوس", "خرم آباد", "رامسر", "رستم کلا", "ساري", "سلمانشهر", "سواد كوه", "فريدون كنار", "قائم شهر", "گلوگاه", "محمودآباد", "مرزن آباد", "نكا", "نور", "نوشهر"};
               break;
           case AZARBAIEJAN_GHARBI:
                cities = new String[]{"اروميه", "اشنويه", "بازرگان", "بوكان", "پلدشت", "پيرانشهر", "تكاب", "خوي", "سردشت", "سلماس", "سيه چشمه- چالدران", "سیمینه", "شاهين دژ", "شوط", "ماكو", "مهاباد", "مياندوآب", "نقده"};
               break;
           case AZARBAIEJAN_SHARGHI:
                cities = new String[]{"آذر شهر", "اسكو", "اهر", "بستان آباد", "بناب", "بندر شرفخانه", "تبريز", "تسوج", "جلفا", "سراب", "شبستر", "صوفیان", "عجبشير", "قره آغاج", "كليبر", "كندوان", "مراغه", "مرند", "ملكان", "ممقان", "ميانه", "هاديشهر", "هريس", "هشترود", "ورزقان"};
               break;
           case HAMEDAN:
                cities = new String[]{"اسدآباد", "بهار", "تويسركان", "رزن", "كبودر اهنگ", "ملاير", "نهاوند", "همدان"};
               break;
           case ESFEHAN:
                cities = new String[]{"آران و بيدگل", "اردستان", "اصفهان", "باغ بهادران", "تيران", "خميني شهر", "خوانسار", "دهاقان", "دولت آباد-اصفهان", "زرين شهر", "زيباشهر (محمديه)", "سميرم", "شاهين شهر", "شهرضا", "فريدن", "فريدون شهر", "فلاورجان", "فولاد شهر", "قهدریجان", "كاشان", "گلپايگان", "گلدشت اصفهان", "گلدشت مركزی", "مباركه اصفهان", "مهاباد-اصفهان", "نايين", "نجف آباد", "نطنز", "هرند"};
               break;
           case HORMOZGAN:
                cities = new String[]{"ابوموسي", "انگهران", "بستك", "بندر جاسك", "بندر لنگه", "بندرعباس", "پارسیان", "حاجي آباد", "دشتی", "دهبارز (رودان)", "قشم", "كيش", "ميناب"};
               break;
           case LORESTAN:
                cities = new String[]{"ازنا", "الشتر", "اليگودرز", "بروجرد", "پلدختر", "خرم آباد", "دورود", "سپید دشت", "كوهدشت", "نورآباد (خوزستان)"};
               break;
           case KOHKILUIE_BOIERAHMAD:
                cities = new String[]{"دهدشت", "دوگنبدان", "سي سخت- دنا", "گچساران", "ياسوج"};
               break;
           case KORDESTAN:
                cities = new String[]{"بانه", "بيجار", "دهگلان", "ديواندره", "سقز", "سنندج", "قروه", "كامياران", "مريوان"};
               break;
           case FARS:
                cities = new String[]{"آباده", "آباده طشك", "اردكان", "ارسنجان", "استهبان", "اشكنان", "اقليد", "اوز", "ایج", "ایزد خواست", "باب انار", "بالاده", "بنارويه", "بهمن", "بوانات", "بيرم", "بیضا", "جنت شهر", "جهرم", "حاجي آباد-زرین دشت", "خاوران", "خرامه", "خشت", "خفر", "خنج", "خور", "داراب", "رونيز عليا", "زاهدشهر", "زرقان", "سده", "سروستان", "سعادت شهر", "سورمق", "ششده", "شيراز", "صغاد", "صفاشهر", "علاء مرودشت", "عنبر", "فراشبند", "فسا", "فيروز آباد", "قائميه", "قادر آباد", "قطب آباد", "قير", "كازرون", "كنار تخته", "گراش", "لار", "لامرد", "لپوئی", "لطيفي", "مبارك آباد ديز", "مرودشت", "مشكان", "مصير", "مهر فارس(گله دار)", "ميمند", "نوبندگان", "نودان", "نورآباد", "ني ريز", "کوار"};
               break;
           case GOLESTAN:
                cities = new String[]{"آزاد شهر", "آق قلا", "انبارآلوم", "اینچه برون", "بندر گز", "تركمن", "جلین", "خان ببین", "راميان", "سرخس کلاته", "سیمین شهر", "علي آباد كتول", "فاضل آباد", "كردكوي", "كلاله", "گالیکش", "گرگان", "گمیش تپه", "گنبد كاووس", "مراوه تپه", "مينو دشت", "نگین شهر", "نوده خاندوز", "نوکنده"};
               break;
           case GILAN:
                cities = new String[]{"آستارا", "آستانه اشرفيه", "املش", "بندرانزلي", "خمام", "رشت", "رضوان شهر", "رود سر", "رودبار", "سياهكل", "شفت", "صومعه سرا", "فومن", "كلاچاي", "لاهيجان", "لنگرود", "لوشان", "ماسال", "ماسوله", "منجيل", "هشتپر"};
               break;
           case CHAHARMAHAL_BAKHTIARI:
                cities = new String[]{"اردل", "بروجن", "چلگرد (كوهرنگ)", "سامان", "شهركرد", "فارسان", "لردگان"};
               break;
           case SISTAN_BALUCHESTAN:
                 cities = new String[]{"ايرانشهر", "چابهار", "خاش", "راسك", "زابل", "زاهدان", "سراوان", "سرباز", "ميرجاوه", "نيكشهر"};
               break;
           case GHOM:
                cities = new String[]{"قم"};
               break;
           case SEMNAN:
                cities = new String[]{"ايوانكي", "بسطام", "دامغان", "سرخه", "سمنان", "شاهرود", "شهمیرزاد", "گرمسار", "مهدیشهر"};
               break;
           case BUSHEHR:
                cities = new String[]{"آبپخش", "اهرم", "برازجان", "بندر دير", "بندر ديلم", "بندر كنگان", "بندر گناوه", "بوشهر", "تنگستان", "جزيره خارك", "جم (ولايت)", "خورموج", "دشتستان - شبانکاره", "دلوار", "عسلویه"};
               break;
           case YAZD:
                cities = new String[]{"ابركوه", "اردكان", "اشكذر", "بافق", "تفت", "مهريز", "ميبد", "هرات", "يزد"};
               break;
           case ZANJAN:
                cities = new String[]{"آب بر (طارم)", "ابهر", "خرمدره", "زرین آباد (ایجرود)", "زنجان", "قیدار (خدا بنده)", "ماهنشان"};
               break;
           case ILAM:
                cities = new String[]{"آبدانان", "ايلام", "ايوان", "دره شهر", "دهلران", "سرابله", "شيروان چرداول", "مهران"};
               break;
           case KHUZESTAN:
                cities = new String[]{"آبادان", "اميديه", "انديمشك", "اهواز", "ايذه", "باغ ملك", "بستان", "بندر ماهشهر", "بندرامام خميني", "بهبهان", "خرمشهر", "دزفول", "رامشیر", "رامهرمز", "سوسنگرد", "شادگان", "شوش", "شوشتر", "لالي", "مسجد سليمان", "هنديجان", "هويزه"};
               break;
           case ARDEBIL:
                cities = new String[]{"اردبيل", "بيله سوار", "پارس آباد", "خلخال", "سرعين", "كيوي (كوثر)", "گرمي (مغان)", "مشگين شهر", "مغان (سمنان)", "نمين", "نير"};
               break;

       }

    return cities;

   }
}
