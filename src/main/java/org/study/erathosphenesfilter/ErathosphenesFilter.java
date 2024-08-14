package org.study.erathosphenesfilter;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ErathosphenesFilter {

    private static final int ZERO = 0;
    private static final int ONE = 1;
    private static final List<Integer> MOST_FIRST_SIMPLES = List.of(
            2, 3, 5, 7, 9, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47,
            53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103, 107, 109, 113, 121, 127, 131, 137, 139,
            143, 149, 151, 157, 163, 167, 169, 173, 179, 181, 187, 191, 193, 197, 199, 209, 211, 221,
            223, 227, 229, 233, 239, 241, 247, 251, 253, 257, 263, 269, 271, 277, 281, 283, 289, 293,
            299, 307, 311, 313, 317, 319, 323, 331, 337, 341, 347, 349, 353, 359, 361, 367, 373, 377,
            379, 383, 389, 391, 397, 401, 403, 407, 409, 419, 421, 431, 433, 437, 439, 443, 449, 451,
            457, 461, 463, 467, 473, 479, 481, 487, 491, 493, 499, 503, 509, 517, 521, 523, 527, 529,
            533, 541, 547, 551, 557, 559, 563, 569, 571, 577, 583, 587, 589, 593, 599, 601, 607, 611,
            613, 617, 619, 629, 631, 641, 643, 647, 649, 653, 659, 661, 667, 671, 673, 677, 683, 689,
            691, 697, 701, 703, 709, 713, 719, 727, 731, 733, 737, 739, 743, 751, 757, 761, 767, 769,
            773, 779, 781, 787, 793, 797, 799, 803, 809, 811, 817, 821, 823, 827, 829, 839, 841, 851,
            853, 857, 859, 863, 869, 871, 877, 881, 883, 887, 893, 899, 901, 907, 911, 913, 919, 923,
            929, 937, 941, 943, 947, 949, 953, 961, 967, 971, 977, 979, 983, 989, 991, 997);
    private static final List<Long> MOST_FIRST_LONG_SIMPLES = List.of(
            2L, 3L, 5L, 7L, 9L, 11L, 13L, 17L, 19L, 23L, 29L, 31L, 37L, 41L, 43L, 47L,
            53L, 59L, 61L, 67L, 71L, 73L, 79L, 83L, 89L, 97L, 101L, 103L, 107L, 109L, 113L, 121L, 127L, 131L, 137L, 139L,
            143L, 149L, 151L, 157L, 163L, 167L, 169L, 173L, 179L, 181L, 187L, 191L, 193L, 197L, 199L, 209L, 211L, 221L,
            223L, 227L, 229L, 233L, 239L, 241L, 247L, 251L, 253L, 257L, 263L, 269L, 271L, 277L, 281L, 283L, 289L, 293L,
            299L, 307L, 311L, 313L, 317L, 319L, 323L, 331L, 337L, 341L, 347L, 349L, 353L, 359L, 361L, 367L, 373L, 377L,
            379L, 383L, 389L, 391L, 397L, 401L, 403L, 407L, 409L, 419L, 421L, 431L, 433L, 437L, 439L, 443L, 449L, 451L,
            457L, 461L, 463L, 467L, 473L, 479L, 481L, 487L, 491L, 493L, 499L, 503L, 509L, 517L, 521L, 523L, 527L, 529L,
            533L, 541L, 547L, 551L, 557L, 559L, 563L, 569L, 571L, 577L, 583L, 587L, 589L, 593L, 599L, 601L, 607L, 611L,
            613L, 617L, 619L, 629L, 631L, 641L, 643L, 647L, 649L, 653L, 659L, 661L, 667L, 671L, 673L, 677L, 683L, 689L,
            691L, 697L, 701L, 703L, 709L, 713L, 719L, 727L, 731L, 733L, 737L, 739L, 743L, 751L, 757L, 761L, 767L, 769L,
            773L, 779L, 781L, 787L, 793L, 797L, 799L, 803L, 809L, 811L, 817L, 821L, 823L, 827L, 829L, 839L, 841L, 851L,
            853L, 857L, 859L, 863L, 869L, 871L, 877L, 881L, 883L, 887L, 893L, 899L, 901L, 907L, 911L, 913L, 919L, 923L,
            929L, 937L, 941L, 943L, 947L, 949L, 953L, 961L, 967L, 971L, 977L, 979L, 983L, 989L, 991L, 997L);
    private static final List<BigInteger> MOST_FIRST_BIG_INT_SIMPLES = List.of(BigInteger.valueOf(2),
            BigInteger.valueOf(3), BigInteger.valueOf(5), BigInteger.valueOf(7), BigInteger.valueOf(9),
            BigInteger.valueOf(11), BigInteger.valueOf(13), BigInteger.valueOf(17), BigInteger.valueOf(19),
            BigInteger.valueOf(23), BigInteger.valueOf(29), BigInteger.valueOf(31), BigInteger.valueOf(37),
            BigInteger.valueOf(41), BigInteger.valueOf(43), BigInteger.valueOf(47), BigInteger.valueOf(53),
            BigInteger.valueOf(59), BigInteger.valueOf(61), BigInteger.valueOf(67), BigInteger.valueOf(71),
            BigInteger.valueOf(73), BigInteger.valueOf(79), BigInteger.valueOf(83), BigInteger.valueOf(89),
            BigInteger.valueOf(97), BigInteger.valueOf(101), BigInteger.valueOf(103), BigInteger.valueOf(107),
            BigInteger.valueOf(109), BigInteger.valueOf(113), BigInteger.valueOf(121), BigInteger.valueOf(127),
            BigInteger.valueOf(131), BigInteger.valueOf(137), BigInteger.valueOf(139), BigInteger.valueOf(143),
            BigInteger.valueOf(149), BigInteger.valueOf(151), BigInteger.valueOf(157), BigInteger.valueOf(163),
            BigInteger.valueOf(167), BigInteger.valueOf(169), BigInteger.valueOf(173), BigInteger.valueOf(179),
            BigInteger.valueOf(181), BigInteger.valueOf(187), BigInteger.valueOf(191), BigInteger.valueOf(193),
            BigInteger.valueOf(197), BigInteger.valueOf(199), BigInteger.valueOf(209), BigInteger.valueOf(211),
            BigInteger.valueOf(221), BigInteger.valueOf(223), BigInteger.valueOf(227), BigInteger.valueOf(229),
            BigInteger.valueOf(233), BigInteger.valueOf(239), BigInteger.valueOf(241), BigInteger.valueOf(247),
            BigInteger.valueOf(251), BigInteger.valueOf(253), BigInteger.valueOf(257), BigInteger.valueOf(263),
            BigInteger.valueOf(269), BigInteger.valueOf(271), BigInteger.valueOf(277), BigInteger.valueOf(281),
            BigInteger.valueOf(283), BigInteger.valueOf(289), BigInteger.valueOf(293), BigInteger.valueOf(299),
            BigInteger.valueOf(307), BigInteger.valueOf(311), BigInteger.valueOf(313), BigInteger.valueOf(317),
            BigInteger.valueOf(319), BigInteger.valueOf(323), BigInteger.valueOf(331), BigInteger.valueOf(337),
            BigInteger.valueOf(341), BigInteger.valueOf(347), BigInteger.valueOf(349), BigInteger.valueOf(353),
            BigInteger.valueOf(359), BigInteger.valueOf(361), BigInteger.valueOf(367), BigInteger.valueOf(373),
            BigInteger.valueOf(377), BigInteger.valueOf(379), BigInteger.valueOf(383), BigInteger.valueOf(389),
            BigInteger.valueOf(391), BigInteger.valueOf(397), BigInteger.valueOf(401), BigInteger.valueOf(403),
            BigInteger.valueOf(407), BigInteger.valueOf(409), BigInteger.valueOf(419), BigInteger.valueOf(421),
            BigInteger.valueOf(431), BigInteger.valueOf(433), BigInteger.valueOf(437), BigInteger.valueOf(439),
            BigInteger.valueOf(443), BigInteger.valueOf(449), BigInteger.valueOf(451), BigInteger.valueOf(457),
            BigInteger.valueOf(461), BigInteger.valueOf(463), BigInteger.valueOf(467), BigInteger.valueOf(473),
            BigInteger.valueOf(479), BigInteger.valueOf(481), BigInteger.valueOf(487), BigInteger.valueOf(491),
            BigInteger.valueOf(493), BigInteger.valueOf(499), BigInteger.valueOf(503), BigInteger.valueOf(509),
            BigInteger.valueOf(517), BigInteger.valueOf(521), BigInteger.valueOf(523), BigInteger.valueOf(527),
            BigInteger.valueOf(529), BigInteger.valueOf(533), BigInteger.valueOf(541), BigInteger.valueOf(547),
            BigInteger.valueOf(551), BigInteger.valueOf(557), BigInteger.valueOf(559), BigInteger.valueOf(563),
            BigInteger.valueOf(569), BigInteger.valueOf(571), BigInteger.valueOf(577), BigInteger.valueOf(583),
            BigInteger.valueOf(587), BigInteger.valueOf(589), BigInteger.valueOf(593), BigInteger.valueOf(599),
            BigInteger.valueOf(601), BigInteger.valueOf(607), BigInteger.valueOf(611), BigInteger.valueOf(613),
            BigInteger.valueOf(617), BigInteger.valueOf(619), BigInteger.valueOf(629), BigInteger.valueOf(631),
            BigInteger.valueOf(641), BigInteger.valueOf(643), BigInteger.valueOf(647), BigInteger.valueOf(649),
            BigInteger.valueOf(653), BigInteger.valueOf(659), BigInteger.valueOf(661), BigInteger.valueOf(667),
            BigInteger.valueOf(671), BigInteger.valueOf(673), BigInteger.valueOf(677), BigInteger.valueOf(683),
            BigInteger.valueOf(689), BigInteger.valueOf(691), BigInteger.valueOf(697), BigInteger.valueOf(701),
            BigInteger.valueOf(703), BigInteger.valueOf(709), BigInteger.valueOf(713), BigInteger.valueOf(719),
            BigInteger.valueOf(727), BigInteger.valueOf(731), BigInteger.valueOf(733), BigInteger.valueOf(737),
            BigInteger.valueOf(739), BigInteger.valueOf(743), BigInteger.valueOf(751), BigInteger.valueOf(757),
            BigInteger.valueOf(761), BigInteger.valueOf(767), BigInteger.valueOf(769), BigInteger.valueOf(773),
            BigInteger.valueOf(779), BigInteger.valueOf(781), BigInteger.valueOf(787), BigInteger.valueOf(793),
            BigInteger.valueOf(797), BigInteger.valueOf(799), BigInteger.valueOf(803), BigInteger.valueOf(809),
            BigInteger.valueOf(811), BigInteger.valueOf(817), BigInteger.valueOf(821), BigInteger.valueOf(823),
            BigInteger.valueOf(827), BigInteger.valueOf(829), BigInteger.valueOf(839), BigInteger.valueOf(841),
            BigInteger.valueOf(851), BigInteger.valueOf(853), BigInteger.valueOf(857), BigInteger.valueOf(859),
            BigInteger.valueOf(863), BigInteger.valueOf(869), BigInteger.valueOf(871), BigInteger.valueOf(877),
            BigInteger.valueOf(881), BigInteger.valueOf(883), BigInteger.valueOf(887), BigInteger.valueOf(893),
            BigInteger.valueOf(899), BigInteger.valueOf(901), BigInteger.valueOf(907), BigInteger.valueOf(911),
            BigInteger.valueOf(913), BigInteger.valueOf(919), BigInteger.valueOf(923), BigInteger.valueOf(929),
            BigInteger.valueOf(937), BigInteger.valueOf(941), BigInteger.valueOf(943), BigInteger.valueOf(947),
            BigInteger.valueOf(949), BigInteger.valueOf(953), BigInteger.valueOf(961), BigInteger.valueOf(967),
            BigInteger.valueOf(971), BigInteger.valueOf(977), BigInteger.valueOf(979), BigInteger.valueOf(983),
            BigInteger.valueOf(989), BigInteger.valueOf(991), BigInteger.valueOf(997));


    public Collection<Integer> filterSimplesTill(Integer max) {
        if (max <= MOST_FIRST_SIMPLES.get(MOST_FIRST_SIMPLES.size() - ONE)) {
            return MOST_FIRST_SIMPLES.stream().filter(core -> core <= max).toList();
        }
        List<Integer> result = new ArrayList<>(MOST_FIRST_SIMPLES);
        int nonSimplesCount = ZERO;
        for (Integer i = MOST_FIRST_SIMPLES.get(MOST_FIRST_SIMPLES.size() - ONE) + ONE; i < max; i++) {
            for (Integer core : MOST_FIRST_SIMPLES) {
                if (i % core == ZERO) {
                    nonSimplesCount++;
                    break;
                }
            }
            if (nonSimplesCount == ZERO) {
                result.add(i);
            }
            nonSimplesCount = ZERO;
        }
        return result;
    }

    public Collection<Long> filterSimplesTill(Long max) {
        if (max <= MOST_FIRST_LONG_SIMPLES.get(MOST_FIRST_LONG_SIMPLES.size() - ONE)) {
            return MOST_FIRST_LONG_SIMPLES.stream().filter(core -> core <= max).toList();
        }
        List<Long> result = new ArrayList<>(MOST_FIRST_LONG_SIMPLES);
        int nonSimplesCount = ZERO;
        for (Long i = MOST_FIRST_LONG_SIMPLES.get(MOST_FIRST_LONG_SIMPLES.size() - ONE) + ONE; i < max; i++) {
            for (Long core : MOST_FIRST_LONG_SIMPLES) {
                if (i % core == ZERO) {
                    nonSimplesCount++;
                    break;
                }
            }
            if (nonSimplesCount == ZERO) {
                result.add(i);
            }
            nonSimplesCount = ZERO;
        }
        return result;
    }

    public Collection<BigInteger> filterSimplesTill(BigInteger max) {
        if (max.compareTo(MOST_FIRST_BIG_INT_SIMPLES.get(MOST_FIRST_BIG_INT_SIMPLES.size() - ONE)) <= ZERO) {
            return MOST_FIRST_BIG_INT_SIMPLES.stream().filter(core -> core.compareTo(max) <= ZERO).toList();
        }
        List<BigInteger> result = new ArrayList<>(MOST_FIRST_BIG_INT_SIMPLES);
        int nonSimplesCount = ZERO;
        for (BigInteger i = MOST_FIRST_BIG_INT_SIMPLES.get(MOST_FIRST_BIG_INT_SIMPLES.size() - ONE).add(BigInteger.ONE);
             i.compareTo(max) < ZERO; i = i.add(BigInteger.ONE)) {
            for (BigInteger core : MOST_FIRST_BIG_INT_SIMPLES) {
                if (i.remainder(core).equals(BigInteger.ZERO)) {
                    nonSimplesCount++;
                    break;
                }
            }
            if (nonSimplesCount == ZERO) {
                result.add(i);
            }
            nonSimplesCount = ZERO;
        }
        return result;
    }

}
