package LEETCODE_Q.HashSet;

import java.util.*;

public class Q1_2040 {
    public static long kthSmallestProduct(int[] nums1, int[] nums2, long k) {
        long[] L_nums1 = convertIntArrayToLongArray(nums1);
        long[] L_nums2 = convertIntArrayToLongArray(nums2);
        ArrayList<Long> prod= new ArrayList<>();
        for (long value : L_nums1) {
            for (long i : L_nums2) {
                prod.add(value * i);
                Collections.sort(prod);
                if (prod.size()>k){prod.remove(prod.size()-1);}
            }
        }
//        System.out.println(prod);
//        Collections.sort(prod);
//        System.out.println(prod);
        return prod.get((int) (k-1));
    }
    public static long[] convertIntArrayToLongArray(int[] intArray) {
        long[] longArray = new long[intArray.length];
        for (int i = 0; i < intArray.length; i++) {
            longArray[i] = intArray[i]; // Casting int to long
        }
        return longArray;
    }
    public static void main(String[] args) {
//        int[] arr1 = {-4,-2,0,3}; int[] arr2 = {2,4}; int k=2;
//        int[] arr1 = {-2,-1,0,1,2}; int[] arr2 = {-3,-1,2,4,5}; int k=3;
//        int[] arr1 = {-2,-1,0,1,2,3,5,7,8}; int[] arr2 = {-9,-7,-5,-4-3,-1,2,4,5}; int k=10;
//        int[] arr1 = {-100000,100000}; int[] arr2 = {-100000,100000}; int k=1;
        int[] arr1 = {-1000,-999,-998,-998,-998,-996,-996,-995,-993,-992,-992,-992,-991,-991,-991,-990,-990,-990,-990,-989,-988,-988,-986,-986,-985,-984,-983,-983,-981,-981,-981,-979,-977,-977,-977,-976,-975,-975,-973,-973,-972,-972,-972,-972,-971,-971,-971,-970,-969,-968,-967,-966,-966,-962,-961,-961,-960,-959,-959,-959,-958,-956,-955,-953,-953,-950,-948,-948,-948,-947,-945,-944,-942,-942,-941,-940,-940,-939,-939,-938,-936,-936,-935,-935,-934,-930,-929,-926,-926,-923,-922,-922,-921,-920,-920,-920,-919,-919,-918,-917,-916,-915,-915,-914,-914,-914,-911,-909,-909,-909,-909,-908,-908,-908,-908,-907,-906,-905,-905,-904,-903,-902,-901,-900,-900,-899,-897,-897,-897,-897,-896,-892,-891,-891,-890,-890,-888,-888,-888,-888,-887,-887,-887,-887,-887,-885,-884,-884,-884,-882,-882,-881,-880,-878,-877,-876,-875,-874,-873,-871,-871,-870,-870,-870,-869,-869,-868,-865,-864,-864,-863,-863,-862,-861,-860,-860,-860,-859,-859,-859,-859,-856,-855,-854,-852,-852,-851,-851,-850,-850,-850,-848,-847,-847,-846,-846,-846,-845,-845,-845,-845,-844,-842,-842,-841,-840,-839,-839,-839,-838,-837,-837,-833,-832,-832,-830,-829,-827,-827,-825,-824,-824,-824,-822,-820,-819,-819,-819,-818,-817,-816,-816,-816,-815,-815,-814,-813,-813,-812,-812,-810,-809,-809,-808,-808,-805,-805,-804,-803,-802,-802,-802,-802,-802,-800,-799,-798,-798,-796,-796,-795,-794,-794,-793,-793,-792,-792,-791,-789,-789,-787,-787,-787,-784,-783,-783,-780,-780,-779,-778,-778,-776,-775,-775,-774,-773,-773,-773,-771,-770,-770,-769,-769,-768,-767,-766,-765,-765,-764,-762,-760,-760,-760,-759,-759,-759,-758,-757,-757,-756,-756,-755,-755,-755,-753,-752,-752,-751,-750,-749,-748,-748,-747,-746,-746,-746,-745,-744,-744,-744,-742,-742,-741,-741,-740,-740,-740,-738,-737,-736,-736,-733,-731,-730,-730,-729,-728,-727,-727,-726,-725,-725,-725,-725,-724,-724,-724,-722,-722,-720,-720,-719,-718,-717,-717,-717,-716,-714,-711,-711,-711,-709,-708,-708,-707,-707,-706,-704,-703,-703,-700,-699,-699,-699,-698,-698,-696,-696,-695,-695,-695,-695,-693,-692,-692,-692,-691,-691,-690,-689,-689,-688,-688,-687,-687,-686,-686,-685,-684,-684,-683,-683,-683,-682,-682,-682,-682,-681,-681,-681,-678,-677,-675,-675,-675,-675,-675,-674,-674,-673,-672,-672,-671,-670,-669,-669,-668,-668,-667,-666,-666,-666,-665,-665,-664,-664,-663,-663,-662,-660,-659,-659,-658,-657,-657,-656,-654,-653,-651,-651,-651,-650,-650,-650,-649,-649,-649,-649,-648,-648,-646,-646,-646,-646,-644,-644,-644,-642,-642,-642,-638,-635,-635,-634,-634,-633,-633,-632,-632,-630,-630,-630,-629,-629,-628,-628,-627,-627,-626,-626,-626,-625,-623,-623,-623,-622,-621,-620,-620,-616,-615,-615,-614,-614,-613,-613,-611,-611,-611,-611,-611,-609,-608,-606,-605,-604,-604,-603,-602,-602,-601,-601,-601,-600,-600,-600,-599,-598,-598,-597,-597,-595,-595,-595,-594,-593,-593,-592,-592,-591,-591,-591,-591,-590,-589,-589,-587,-587,-587,-586,-585,-585,-585,-584,-584,-584,-583,-583,-582,-582,-581,-581,-581,-581,-580,-580,-579,-579,-577,-575,-570,-570,-570,-568,-566,-566,-566,-566,-565,-564,-563,-563,-562,-561,-558,-558,-558,-556,-556,-556,-555,-555,-554,-554,-553,-550,-549,-549,-549,-548,-546,-545,-544,-543,-541,-541,-540,-539,-537,-536,-535,-535,-534,-532,-531,-530,-530,-530,-529,-527,-527,-526,-524,-523,-523,-521,-520,-519,-519,-518,-516,-515,-515,-514,-514,-513,-512,-512,-511,-511,-511,-510,-510,-510,-510,-509,-509,-508,-508,-508,-508,-508,-507,-507,-506,-506,-505,-503,-503,-501,-500,-500,-499,-498,-498,-496,-496,-495,-495,-494,-494,-493,-493,-490,-489,-488,-488,-488,-487,-487,-484,-484,-484,-483,-482,-481,-481,-481,-480,-480,-477,-477,-477,-476,-475,-475,-475,-474,-472,-471,-470,-470,-470,-469,-469,-467,-467,-467,-465,-465,-464,-464,-463,-463,-463,-463,-462,-462,-462,-460,-459,-458,-457,-455,-455,-455,-454,-454,-452,-452,-452,-450,-449,-446,-443,-442,-442,-441,-440,-440,-440,-437,-437,-437,-436,-435,-433,-433,-432,-432,-432,-431,-430,-428,-427,-425,-424,-424,-424,-423,-423,-421,-420,-418,-418,-417,-417,-417,-416,-416,-415,-413,-412,-411,-411,-411,-410,-410,-407,-406,-406,-406,-405,-404,-401,-401,-400,-400,-399,-399,-399,-396,-396,-395,-395,-394,-394,-393,-392,-390,-389,-387,-386,-386,-384,-383,-383,-382,-381,-381,-381,-377,-376,-376,-376,-375,-375,-373,-373,-372,-372,-370,-369,-367,-367,-367,-366,-366,-364,-364,-363,-363,-360,-360,-359,-358,-358,-358,-358,-356,-356,-353,-350,-349,-349,-349,-348,-347,-346,-345,-344,-343,-342,-341,-340,-340,-337,-336,-336,-335,-335,-334,-333,-332,-332,-331,-329,-329,-329,-327,-327,-327,-326,-325,-324,-323,-323,-322,-322,-321,-319,-319,-319,-318,-317,-316,-316,-316,-315,-315,-314,-313,-312,-312,-312,-312,-311,-310,-309,-307,-307,-307,-307,-307,-306,-305,-303,-303,-303,-302,-302,-300,-296,-296,-294,-294,-293,-292,-289,-289,-289,-287,-286,-286,-285,-285,-284,-284,-284,-283,-282,-281,-278,-278,-278,-276,-275,-274,-274,-273,-272,-272,-272,-271,-270,-269,-267,-267,-265,-263,-263,-262,-261,-261,-260,-260,-259,-259,-257,-256,-256,-255,-255,-253,-252,-251,-250,-249,-249,-249,-248,-248,-246,-245,-244,-242,-241,-241,-240,-238,-237,-237,-236,-234,-233,-233,-231,-231,-231,-229,-228,-228,-227,-227,-224,-224,-222,-221,-220,-220,-220,-219,-219,-219,-218,-217,-216,-216,-216,-215,-215,-215,-215,-214,-214,-214,-214,-214,-213,-213,-213,-212,-212,-211,-211,-211,-209,-208,-207,-207,-207,-206,-206,-205,-204,-202,-202,-202,-202,-201,-200,-200,-196,-196,-194,-193,-191,-190,-190,-189,-189,-188,-188,-187,-186,-185,-185,-184,-183,-183,-182,-182,-182,-182,-180,-179,-179,-178,-178,-176,-175,-175,-175,-173,-172,-172,-171,-170,-170,-170,-169,-167,-167,-166,-166,-166,-166,-165,-165,-164,-163,-162,-161,-161,-157,-156,-156,-156,-154,-153,-152,-152,-151,-151,-150,-149,-149,-149,-149,-147,-146,-145,-145,-144,-144,-144,-144,-144,-143,-143,-141,-141,-140,-140,-140,-139,-137,-137,-136,-135,-133,-132,-131,-130,-130,-130,-130,-127,-126,-126,-125,-125,-124,-124,-123,-122,-121,-120,-120,-119,-119,-118,-118,-117,-116,-116,-116,-115,-113,-113,-110,-110,-108,-108,-108,-108,-107,-106,-106,-104,-101,-101,-100,-99,-99,-98,-97,-96,-95,-94,-93,-93,-93,-93,-92,-92,-91,-90,-90,-88,-88,-87,-87,-86,-85,-84,-83,-83,-83,-82,-82,-80,-80,-80,-79,-79,-78,-78,-77,-77,-75,-74,-71,-71,-69,-69,-69,-68,-67,-66,-65,-65,-63,-62,-62,-62,-60,-59,-58,-56,-56,-56,-54,-54,-53,-53,-53,-52,-50,-49,-49,-48,-47,-47,-47,-45,-45,-44,-43,-42,-42,-42,-42,-39,-37,-37,-37,-35,-34,-33,-33,-32,-32,-32,-32,-30,-28,-27,-26,-26,-26,-24,-24,-24,-22,-21,-21,-20,-19,-18,-18,-17,-16,-16,-15,-15,-15,-15,-14,-14,-14,-13,-11,-10,-10,-8,-6,-4,-4,-3,-1,0,1,3,4,5,5,5,7,8,9,10,11,12,13,15,16,16,17,18,19,20,20,20,20,22,22,23,23,24,24,24,25,25,25,25,27,27,29,29,29,30,30,30,30,32,34,34,35,35,36,37,37,37,37,38,38,39,41,42,45,46,46,46,47,48,50,50,50,51,51,51,51,52,54,54,55,56,57,57,57,59,60,61,62,63,63,65,66,66,66,67,68,68,69,70,71,72,73,73,74,74,77,77,78,78,79,80,80,80,81,83,84,85,85,85,86,86,86,87,87,87,89,90,90,90,90,91,92,92,93,93,93,93,93,94,94,94,94,95,95,96,96,96,97,98,99,100,100,100,101,101,102,102,103,104,105,106,110,113,113,114,114,115,116,117,118,118,118,120,121,121,122,122,123,123,124,124,125,125,126,129,131,131,132,133,133,135,136,136,137,138,138,141,143,144,144,144,145,145,145,145,146,147,147,148,148,149,150,151,152,154,154,155,155,155,157,159,160,160,161,162,162,162,163,166,166,167,167,167,169,170,170,171,171,172,172,172,173,173,174,175,176,176,176,177,181,182,182,183,184,185,185,186,186,188,188,188,188,189,190,191,191,192,193,193,194,194,194,195,195,195,196,196,196,196,196,197,198,198,198,199,200,200,200,200,201,201,202,202,205,207,207,207,207,208,211,211,214,215,215,216,217,218,219,219,220,221,221,221,223,225,226,226,227,228,229,230,230,230,230,230,232,232,235,235,235,236,236,236,237,240,240,240,241,242,242,242,244,244,245,246,247,248,248,250,250,251,252,252,253,254,255,256,256,256,258,259,260,260,263,263,263,263,264,264,264,265,266,267,269,269,270,271,271,271,272,273,273,273,274,275,275,277,278,280,282,282,283,285,287,287,288,288,289,290,291,291,292,292,293,296,297,297,297,297,299,300,300,302,302,303,303,304,305,306,306,306,307,308,311,312,313,314,315,315,316,317,318,318,319,321,321,322,322,323,324,325,325,326,326,326,327,328,328,329,330,330,331,331,332,333,333,335,336,336,337,337,341,341,342,342,343,343,344,344,345,345,345,346,351,352,353,354,355,356,357,357,358,358,359,359,359,359,360,360,361,362,362,362,364,365,366,367,368,368,369,369,370,370,371,371,371,372,373,374,375,375,375,375,376,378,379,381,381,382,383,383,384,385,385,385,387,387,387,388,388,388,389,389,390,390,391,391,391,392,393,393,394,394,396,397,397,398,398,398,398,399,399,400,400,401,401,402,403,403,403,404,405,406,406,406,407,408,408,409,410,412,413,413,414,416,416,417,417,418,419,419,419,420,420,420,420,420,421,422,422,426,427,428,429,431,432,432,434,435,435,436,438,438,438,438,438,440,442,444,446,447,447,448,450,450,452,454,456,456,456,457,458,460,464,464,465,468,468,469,469,469,471,471,472,472,473,473,474,474,476,476,476,477,477,477,478,478,478,479,479,480,482,482,482,484,485,485,487,488,490,491,492,493,494,494,494,494,494,495,496,496,497,497,499,499,499,500,500,500,501,502,503,503,503,505,505,506,506,506,506,507,509,509,510,511,511,512,513,514,515,515,515,516,517,517,518,518,519,519,520,520,520,521,521,524,525,525,526,526,527,527,527,528,530,530,530,531,532,533,534,534,536,536,536,537,539,541,543,544,546,546,546,547,548,548,549,550,550,551,551,552,552,553,553,553,554,554,555,556,556,556,557,558,558,559,560,561,561,562,564,566,566,567,567,567,570,570,571,572,579,581,581,582,583,584,587,589,592,593,594,594,595,595,598,598,599,600,600,600,601,602,602,602,603,605,605,606,608,609,609,609,610,611,612,612,612,613,613,614,614,615,615,615,616,616,618,619,619,621,621,622,622,622,622,623,623,624,626,628,628,629,629,630,630,631,632,632,633,634,635,637,638,638,638,638,638,638,638,639,639,641,642,643,643,646,649,649,649,650,652,652,654,654,655,656,656,656,657,657,657,657,658,660,661,661,663,663,663,665,665,666,667,669,669,672,673,673,673,675,675,676,677,678,679,679,679,680,681,682,684,684,685,685,688,688,688,689,689,690,692,694,695,696,697,698,698,698,699,701,701,704,704,706,708,708,709,709,709,712,714,715,716,716,718,720,720,720,720,722,724,727,728,728,730,733,735,735,735,735,736,736,737,740,742,743,743,744,744,745,748,749,750,750,750,751,751,752,753,753,753,754,754,755,755,755,755,755,756,756,756,757,759,761,761,761,761,762,762,765,766,767,767,768,768,768,769,769,769,770,770,771,772,772,772,773,773,774,775,775,776,776,778,778,779,781,782,782,782,784,784,785,785,787,787,789,790,790,791,791,792,792,792,795,795,795,795,796,796,797,798,799,801,801,802,803,804,804,804,805,805,807,807,807,808,811,812,812,815,815,817,818,819,821,821,822,823,823,823,824,824,824,824,824,825,825,826,827,827,829,829,829,829,830,833,834,834,834,837,837,838,839,839,840,841,843,843,846,847,847,847,849,849,849,849,849,850,851,852,852,852,854,854,854,855,858,858,860,862,864,864,866,866,869,869,870,870,871,871,872,872,874,875,876,876,877,877,877,878,878,879,880,881,881,882,883,883,883,885,887,888,890,891,892,893,896,896,896,897,898,898,900,901,901,903,903,904,905,905,906,906,907,907,908,909,909,909,910,910,912,913,913,914,915,916,918,920,920,920,921,921,922,922,922,922,923,923,925,926,927,931,932,932,932,934,934,934,935,936,936,936,937,937,939,939,940,941,941,942,943,945,945,947,948,949,952,953,953,954,954,958,958,958,960,961,961,962,962,963,963,964,965,965,966,967,968,968,969,970,971,971,972,972,973,973,974,974,974,975,975,976,976,977,977,977,977,978,978,978,978,980,980,981,981,981,986,986,987,987,987,988,989,989,989,989,990,991,991,992,992,992,998,999,999};
        int[] arr2 = {-999,-998,-998,-997,-997,-994,-990,-987,-987,-987,-985,-984,-982,-981,-980,-980,-979,-978,-976,-970,-969,-967,-967,-966,-963,-962,-958,-958,-956,-956,-955,-955,-952,-950,-949,-948,-947,-943,-941,-941,-941,-940,-937,-935,-934,-933,-932,-932,-931,-929,-929,-928,-928,-928,-926,-926,-923,-922,-921,-916,-916,-914,-913,-911,-909,-908,-907,-907,-907,-905,-901,-900,-899,-899,-897,-897,-897,-891,-890,-889,-886,-886,-885,-885,-882,-880,-879,-877,-873,-873,-872,-872,-871,-870,-867,-865,-865,-864,-864,-862,-859,-857,-856,-854,-854,-853,-852,-852,-851,-848,-848,-847,-847,-846,-843,-840,-839,-834,-834,-834,-833,-833,-829,-828,-828,-824,-824,-823,-823,-822,-819,-816,-814,-814,-812,-812,-812,-811,-809,-808,-806,-806,-806,-806,-804,-803,-802,-801,-800,-800,-800,-791,-789,-789,-789,-786,-786,-785,-778,-776,-775,-774,-773,-773,-771,-770,-768,-767,-764,-763,-762,-761,-761,-760,-757,-756,-756,-755,-753,-752,-752,-751,-750,-748,-747,-745,-744,-741,-740,-739,-739,-739,-739,-738,-735,-732,-732,-732,-731,-731,-731,-729,-722,-721,-721,-719,-718,-718,-718,-714,-710,-710,-708,-705,-703,-702,-701,-699,-696,-694,-693,-688,-687,-686,-685,-683,-682,-682,-681,-681,-676,-673,-672,-670,-669,-668,-668,-665,-663,-662,-659,-653,-652,-652,-650,-649,-649,-648,-648,-645,-645,-643,-637,-635,-631,-630,-629,-629,-629,-629,-627,-624,-624,-624,-623,-623,-622,-622,-621,-619,-618,-616,-616,-610,-609,-606,-606,-605,-605,-604,-604,-602,-598,-597,-596,-596,-593,-588,-582,-582,-580,-578,-576,-576,-576,-573,-573,-568,-568,-567,-566,-566,-565,-565,-565,-564,-561,-560,-560,-557,-556,-555,-555,-552,-551,-551,-551,-550,-550,-549,-549,-549,-546,-545,-544,-544,-543,-542,-538,-536,-535,-535,-534,-533,-529,-528,-524,-523,-520,-520,-520,-520,-519,-518,-517,-515,-512,-512,-511,-509,-508,-507,-506,-505,-504,-503,-498,-498,-496,-495,-495,-494,-493,-491,-490,-490,-489,-488,-488,-486,-483,-481,-481,-480,-479,-478,-474,-474,-474,-474,-473,-472,-471,-471,-470,-469,-469,-468,-468,-467,-465,-464,-463,-463,-463,-459,-459,-456,-452,-451,-451,-450,-450,-449,-449,-449,-448,-447,-440,-440,-439,-439,-438,-437,-437,-437,-436,-434,-432,-431,-431,-430,-428,-427,-425,-423,-422,-422,-422,-421,-420,-419,-418,-414,-412,-408,-405,-405,-404,-398,-397,-396,-395,-395,-395,-394,-393,-393,-392,-391,-390,-390,-390,-387,-386,-384,-383,-378,-377,-374,-373,-369,-369,-369,-363,-363,-361,-360,-357,-356,-355,-355,-354,-354,-353,-346,-344,-343,-342,-341,-341,-341,-340,-339,-339,-338,-337,-331,-331,-330,-328,-325,-325,-324,-324,-321,-321,-319,-318,-318,-316,-315,-314,-311,-311,-310,-310,-308,-308,-306,-305,-305,-304,-302,-302,-301,-301,-300,-300,-297,-296,-296,-294,-292,-292,-292,-291,-291,-285,-283,-281,-279,-278,-271,-266,-266,-264,-263,-263,-263,-262,-261,-260,-257,-257,-257,-255,-252,-252,-250,-248,-248,-248,-247,-246,-244,-243,-243,-241,-240,-237,-235,-234,-234,-234,-233,-231,-230,-229,-222,-222,-222,-217,-217,-214,-214,-213,-211,-208,-207,-206,-203,-203,-203,-202,-202,-200,-200,-199,-198,-195,-194,-194,-193,-190,-190,-189,-188,-188,-187,-185,-185,-183,-182,-179,-177,-176,-175,-175,-174,-173,-170,-169,-169,-166,-166,-164,-164,-161,-159,-158,-157,-157,-155,-154,-153,-152,-149,-145,-140,-140,-139,-135,-133,-131,-131,-130,-129,-127,-123,-123,-118,-118,-118,-118,-118,-115,-115,-113,-113,-113,-112,-111,-110,-107,-105,-104,-104,-103,-103,-103,-102,-102,-101,-99,-98,-97,-97,-94,-93,-93,-92,-92,-91,-91,-89,-89,-85,-84,-82,-82,-82,-81,-81,-79,-79,-79,-77,-76,-76,-76,-75,-75,-74,-72,-72,-71,-69,-68,-67,-66,-66,-65,-62,-61,-60,-59,-59,-56,-55,-55,-55,-53,-52,-52,-51,-49,-48,-47,-47,-45,-45,-44,-44,-44,-40,-36,-32,-31,-27,-27,-26,-25,-23,-22,-22,-20,-18,-18,-15,-9,-9,-8,-7,-6,-5,-5,-3,-3,-2,-1,0,1,2,3,3,7,7,7,8,9,10,11,13,15,15,17,17,18,19,27,30,30,31,33,36,36,39,42,42,43,45,46,46,48,50,53,54,54,55,55,56,57,57,58,59,59,61,62,62,63,63,69,70,71,71,71,72,73,75,75,77,78,79,81,83,84,85,86,86,88,88,89,91,93,95,97,98,101,101,103,103,103,104,104,106,107,107,109,109,113,113,114,116,117,118,119,121,124,124,125,125,126,128,131,131,132,132,133,133,133,134,136,143,143,143,145,146,146,147,150,150,150,152,152,153,155,157,158,159,159,160,160,163,163,164,165,167,168,168,176,177,181,184,184,184,185,186,188,188,189,191,192,193,194,196,199,204,204,206,206,207,207,208,209,210,210,211,212,212,212,212,214,214,215,216,216,217,218,220,222,223,223,223,227,227,229,229,230,232,233,234,236,236,237,238,238,240,240,242,243,243,243,244,245,247,247,251,253,257,257,257,259,262,262,271,272,277,279,280,281,284,286,287,288,292,294,295,295,295,297,297,298,302,303,304,304,304,304,305,305,306,312,312,314,314,315,317,319,320,320,320,328,329,329,331,331,336,339,339,342,344,345,348,352,353,356,356,356,357,362,363,364,366,370,371,372,373,376,376,377,378,378,379,388,388,388,389,389,389,391,391,392,393,395,397,397,397,399,399,400,401,403,403,404,405,407,407,408,410,410,411,412,413,414,417,417,419,421,421,422,424,425,425,427,428,428,429,431,434,437,440,442,444,446,447,450,451,451,454,454,455,456,456,459,461,462,463,463,464,464,464,465,467,468,470,470,471,471,471,472,473,474,475,475,475,475,476,477,479,479,481,483,485,487,488,490,490,491,492,493,496,497,497,499,500,500,500,501,502,502,503,505,506,506,507,507,508,510,513,514,514,518,518,519,519,522,526,528,528,530,530,531,531,534,534,535,537,537,538,544,545,546,547,550,552,552,554,554,554,555,555,555,556,558,561,563,564,564,564,569,569,570,570,571,571,574,575,576,577,580,581,586,587,588,589,591,592,597,597,598,598,601,605,607,608,611,612,613,614,615,616,617,622,623,623,625,627,627,627,629,630,631,632,633,635,635,636,638,640,641,645,645,645,646,647,647,648,650,653,653,655,656,657,657,659,663,664,666,667,667,668,670,670,670,671,671,672,677,677,678,679,680,681,682,684,685,686,687,687,689,692,693,695,696,698,699,700,701,703,704,706,708,709,710,712,713,714,718,719,721,722,722,723,725,725,726,727,728,728,732,734,735,735,735,738,739,739,741,742,743,747,748,749,750,754,756,757,757,757,759,761,761,763,765,765,767,769,769,771,773,779,781,782,782,783,784,786,788,793,794,794,795,796,797,797,798,800,801,802,802,805,806,808,810,811,814,814,816,816,818,819,824,824,826,826,827,827,829,831,832,832,832,833,834,834,834,836,837,839,841,843,843,843,844,844,845,845,846,846,846,847,849,849,849,851,851,852,852,854,857,858,858,859,859,859,860,861,866,868,869,869,870,870,872,873,875,876,876,878,881,881,881,883,883,884,885,886,887,889,890,891,893,893,894,895,896,896,898,904,904,905,905,906,911,912,914,918,918,919,921,922,924,924,925,926,930,930,930,931,931,934,939,939,941,942,943,943,944,944,945,945,947,947,949,950,950,951,951,952,952,953,955,956,959,959,959,960,960,962,965,966,967,968,971,971,974,977,977,978,978,979,979,980,983,985,985,986,987,991,992,993,993,995,996,1000,1000};
        int k=418019;
        System.out.println(kthSmallestProduct(arr1,arr2,k));
    }

}