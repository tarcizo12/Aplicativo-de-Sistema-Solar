package com.example.projetosistemasolar

import com.example.projetosistemasolar.models.Planets

class DataSourcePlanets {

    companion object{
        fun createDataSet(): ArrayList<Planets>{
            val planetsList = ArrayList<Planets>()

                planetsList.add(
                    Planets(
                    "Mercúrio",
                    "As primeiras observações registradas de Mercúrio datam pelo menos do primeiro milênio antes de Cristo. Antes do século IV a.C., " +
                            "astrônomos gregos acreditavam que se tratasse de dois objetos distintos: um visível no nascer do sol, ao qual chamavam Apolo, e " +
                            "outro visível ao pôr do Sol, chamado de Hermes.[7] O nome em português para o planeta provém da Roma Antiga, onde o astro recebeu o nome do deus romano " +
                            "Mercúrio, que tinha na mitologia grega o nome de Hermes (Ἑρμῆς). O símbolo astronômico de Mercúrio é uma versão estilizada do caduceu de Hermes.[8]" ,
                    "https://pt.wikipedia.org/wiki/Merc%C3%BArio_(planeta)",
                    "https://pt.wikipedia.org/wiki/Merc%C3%BArio_(planeta)#/media/Ficheiro:Mercury_in_color_-_Prockter07-edit1.jpg"
                    )
                )

                planetsList.add(
                    Planets(
                    "Vênus",
                    "O segundo planeta a partir do Sol possui tamanho, composição e massa similares à Terra. Contudo, o seu período de rotação é de 243 dias, superior ao tempo que " +
                            "Vênus leva a completar uma órbita ao redor do Sol, pelo que um dia venusiano é mais longo que um ano venusiano. Apesar de o núcleo ferroso de Vênus ser similar ao da Terra, a rotação" +
                            " extremamente lenta de Vênus não permite a existência de um campo magnético. A atmosfera venusiana, extraordinariamente espessa e violenta, é composta primariamente por dióxido de carbono e vapores de" +
                            " ácido sulfúrico na forma de nuvens permanentes que envolvem todo o planeta. Como consequência, além de uma intensa pressão atmosférica (noventa vezes superior à" +
                            " pressão atmosférica terrestre), ocorre um superefeito estufa que faz com que a temperatura na superfície atinja mais de 470 graus Celsius.[33]",
                    "https://pt.wikipedia.org/wiki/V%C3%A9nus_(planeta)",
                    "https://pt.wikipedia.org/wiki/V%C3%A9nus_(planeta)#/media/Ficheiro:PIA23791-Venus-RealAndEnhancedContrastViews-20200608_(cropped2).jpg"
                    )

                )

                planetsList.add(
                    Planets(
                    "Terra",
                    "O maior planeta telúrico e o quinto maior do Sistema Solar, é o terceiro a contar do Sol. Seu núcleo é constituído principalmente por ferro, ao redor do qual encontra-se uma camada" +
                            " de rochas fundidas, por sua vez cercada por uma crosta relativamente fina e dividida em placas tectônicas em constante movimento, responsáveis pelas atividades sísmica e vulcânica na Terra. " +
                            "O núcleo metálico e a rotação do planeta permitem a formação de um substancial campo magnético. Com mais de setenta por cento de sua superfície coberta por água, a Terra apresenta uma " +
                            "peculiaridade em relação aos demais planetas, já que é o único conhecido a abrigar vida. Os seres que nele habitam influenciam a composição e a dinâmica da atmosfera terrestre, formada " +
                            "principalmente por nitrogênio e oxigênio. A inclinação do eixo de rotação é responsável pela ocorrência de estações que regulam o clima.[34]",

                    "https://pt.wikipedia.org/wiki/Terra",
                    "https://pt.wikipedia.org/wiki/Terra#/media/Ficheiro:The_Earth_seen_from_Apollo_17.jpg"
                    )

                )

                planetsList.add(
                    Planets(
                    "Marte",
                    "O planeta telúrico mais afastado do Sol passou a ser um mundo intrigante a partir do advento das observações telescópicas. Exibindo calotas polares variáveis e características superficiais mutantes, " +
                            "levantava suspeitas da possível existência de vida fora da Terra. Contudo, após o envio de sondas e exploradores robóticos, descobriu-se que Marte é um planeta desértico e não se constatou a existência de " +
                            "seres vivos. Entretanto, a sonda Mars Reconnaissance Orbiter revelou veios de água salgada que fluem em regiões montanhosas nos meses mais quentes do planeta, aumentando a possibilidade da existência de vida" +
                            " micro-orgânica.[37] Com metade do tamanho da Terra, apresenta acidentes geográficos notáveis, como o Monte Olimpo, o maior vulcão extinto do Sistema Solar, com altitude três vezes maior do que a do Monte " +
                            "Everest, e o Valles Marineris, um sistema de cânions que se estende por mais de três mil quilômetros na região equatorial.[38]",

                    "https://pt.wikipedia.org/wiki/Marte_(planeta)",
                    "https://pt.wikipedia.org/wiki/Marte_(planeta)#/media/Ficheiro:OSIRIS_Mars_true_color.jpg"
                    )

                )

                planetsList.add(
                    Planets(
                    "Júpiter",
                    "O maior e mais massivo planeta do Sistema Solar exibe peculiares faixas multicoloridas criadas por fortíssimos ventos que percorrem faixas longitudinais na parte superior de sua atmosfera. Frequentemente " +
                            "surgem nessas bandas vórtices e sistemas de tempestades circulares, como a Grande Mancha Vermelha, uma tormenta maior que a Terra que já dura por séculos. Dentre os gases que compõem sua atmosfera, " +
                            "hidrogênio e hélio são os mais abundantes, seguidos por pequenas frações de vapor d'água, metano e amônia.[42] Nas camadas gasosas inferiores do planeta, a pressão atmosférica é suficiente para liquefazer o" +
                            " hidrogênio. Já nas camadas mais internas do planeta, o mesmo elemento adquire propriedades metálicas e se torna eletricamente condutivo,dando origem, através do fluxo de cargas elétricas, " +
                            "a um poderoso campo magnético cuja intensidade é vinte mil vezes superior ao que é produzido pela Terra.[43]",

                    "https://pt.wikipedia.org/wiki/J%C3%BApiter_(planeta)",
                    "https://pt.wikipedia.org/wiki/J%C3%BApiter_(planeta)#/media/Ficheiro:Jupiter_and_its_shrunken_Great_Red_Spot.jpg"
                    )

                )

                planetsList.add(
                    Planets(
                    "Saturno",
                    "O segundo maior planeta do Sistema Solar possui uma composição semelhante à de Júpiter, rica em hidrogênio e hélio. Sua atmosfera, em função do calor irradiado do interior de Saturno, apresenta-se em constante" +
                            " turbulência, com ventos de mais de 1 800 quilômetros por hora que criam bandas visíveis nas suas camadas superiores em tons de amarelo e dourado. Embora mais fraco que o de Júpiter, o campo magnético do" +
                            " planeta ainda é quinhentas vezes mais intenso que o terrestre. Contudo, a característica mais notável de Saturno é seu impressionante sistema de anéis, formado essencialmente por fragmentos de gelo que se " +
                            "espalham por faixas, com milhares de quilômetros de extensão e paralelo ao equador do planeta. Sua espessura média é de apenas dez metros, nunca excedendo 1,5 quilômetro, e a maioria dos corpos que o compõem " +
                            "apresentam tipicamente dimensões entre um centímetro e dez metros.[46]",

                    "https://pt.wikipedia.org/wiki/Saturno_(planeta)",
                    "https://pt.wikipedia.org/wiki/Saturno_(planeta)#/media/Ficheiro:Saturn_during_Equinox.jpg"
                    )

                )


                planetsList.add(
                    Planets(
                    "Netuno",
                    "O gigante e gelado Netuno é o planeta mais afastado do Sol e foi o primeiro a ser localizado a partir de cálculos matemáticos em vez de observações regulares do céu. Sua busca foi motivada" +
                            " por se terem constatado irregularidades na órbita de Urano que só poderiam ser explicadas pela interação com um corpo de massa considerável ainda desconhecido. Observações subsequentes " +
                            "da área onde Netuno se deveria encontrar, segundo os resultados calculados, vieram comprovar a sua existência. A extremamente violenta atmosfera netuniana, com ventos cuja velocidade " +
                            "máxima de 1 200 km/h excede nove vezes a dos mais intensos que ocorrem na Terra, apresenta relevante porcentagem de metano, responsável por sua coloração azulada. Frequentemente surgem " +
                            "sistemas de tempestades circulares no planeta, como a grande mancha escura, um sistema anticiclônico maior que a Terra que desapareceu alguns anos após ser fotografado pela sonda Voyager 2." +
                            " Presume-se que as camadas intermediárias de Netuno sejam formadas por compostos gelados, como amônia e água, ao redor de um núcleo rochoso.[50]",

                    "https://pt.wikipedia.org/wiki/Netuno_(planeta)",
                    "https://pt.wikipedia.org/wiki/Netuno_(planeta)#/media/Ficheiro:Neptune_-_Voyager_2_(29347980845)_flatten_crop.jpg"
                    )

                )

                planetsList.add(
                    Planets(
                    "Netuno",
                    "O gigante e gelado Netuno é o planeta mais afastado do Sol e foi o primeiro a ser localizado a partir de cálculos matemáticos em vez de observações regulares do céu. Sua busca foi motivada" +
                            " por se terem constatado irregularidades na órbita de Urano que só poderiam ser explicadas pela interação com um corpo de massa considerável ainda desconhecido. Observações subsequentes " +
                            "da área onde Netuno se deveria encontrar, segundo os resultados calculados, vieram comprovar a sua existência. A extremamente violenta atmosfera netuniana, com ventos cuja velocidade " +
                            "máxima de 1 200 km/h excede nove vezes a dos mais intensos que ocorrem na Terra, apresenta relevante porcentagem de metano, responsável por sua coloração azulada. Frequentemente surgem " +
                            "sistemas de tempestades circulares no planeta, como a grande mancha escura, um sistema anticiclônico maior que a Terra que desapareceu alguns anos após ser fotografado pela sonda Voyager 2." +
                            " Presume-se que as camadas intermediárias de Netuno sejam formadas por compostos gelados, como amônia e água, ao redor de um núcleo rochoso.[50]",

                    "https://pt.wikipedia.org/wiki/Netuno_(planeta)",
                    "https://pt.wikipedia.org/wiki/Netuno_(planeta)#/media/Ficheiro:Neptune_-_Voyager_2_(29347980845)_flatten_crop.jpg"
                    )

                )

                planetsList.add(
                    Planets(
                    "Ceres",
                    "Ceres (na designação de planeta menor 1 Ceres; símbolo: ⚳)[1] é um planeta anão localizado no cinturão de asteroides entre Marte e Júpiter, sendo o maior dos asteroides. Desde sua descoberta em " +
                            "janeiro de 1801 por Giuseppe Piazzi, Ceres recebeu diversas classificações, sendo inicialmente considerado planeta e posteriormente asteroide. Em 2006 foi enquadrado na categoria de planeta " +
                            "anão.Possui um formato arredondado e uma superfície escura cheia de crateras. É constituído possivelmente por um núcleo rochoso circundado por um manto de gelo. Sua superfície, conforme" +
                            " anteriormente observado pelo Telescópio Espacial Hubble, apresenta regiões mais escuras, além de locais de brilho proeminente, de natureza ainda desconhecida. ",

                    "https://pt.wikipedia.org/wiki/Ceres_(planeta_an%C3%A3o)",
                    "https://pt.wikipedia.org/wiki/Ceres_(planeta_an%C3%A3o)#/media/Ficheiro:Color_global_view_of_Ceres_-_Oxo_and_Haulani_craters.png"
                    )

                )

            planetsList.add(
                    Planets(
                    "Plutão",
                    "Plutão, formalmente designado 134340 Plutão (símbolos: \u2BD3 e ♇) é um planeta anão do Sistema Solar e o nono maior e décimo mais massivo objeto observado diretamente orbitando o Sol. " +
                            "Originalmente classificado como um planeta, Plutão é atualmente o maior membro conhecido do cinturão de Kuiper,[11] uma região de corpos além da órbita de Netuno. Como outros membros do " +
                            "cinturão de Kuiper, Plutão é composto primariamente de rocha e gelo e é relativamente pequeno, com aproximadamente um quinto da massa da Lua e um terço de seu volume. Ele tem uma órbita " +
                            "altamente inclinada e excêntrica que o leva de 30 a 49 UA do Sol. Isso faz Plutão ficar periodicamente mais perto do Sol do que Netuno (Neptuno). Atualmente Plutão está a 32,9 UA do Sol.[8] ",

                    "https://pt.wikipedia.org/wiki/Plut%C3%A3o",
                    "https://pt.wikipedia.org/wiki/Plut%C3%A3o#/media/Ficheiro:Pluto_in_True_Color_-_High-Res.jpg"
                    )

                )

            planetsList.add(
                    Planets(
                    "Éris",
                    "Éris ou 136199 Eris (designação de planeta menor, símbolo: \u2BF0)[2] é um planeta anão[3] plutoide[4] situado nos confins do sistema solar, em uma distância de 97 UA do Sol, em seu afélio, " +
                            "em uma região conhecida como disco disperso.Quando foi descoberto, ficou desde logo informalmente conhecido como o \"décimo planeta\", porque na época seu diâmetro estimado era maior do que o " +
                            "Éris tem um período orbital de cerca de 560 anos e encontra-se a cerca de 97 UA do Sol, em seu afélio. Como Plutão, a sua órbita é bastante excêntrica, e leva o planeta a uma distância de " +
                            "apenas 35 UA do Sol no seu periélio (a distância de Plutão ao Sol varia entre 29 e 49,5 UA, enquanto que a órbita de Neptuno fica por cerca de 30 UA). ",

                    "https://pt.wikipedia.org/wiki/%C3%89ris_(planeta_an%C3%A3o)",
                    "https://pt.wikipedia.org/wiki/%C3%89ris_(planeta_an%C3%A3o)#/media/Ficheiro:Eris_and_dysnomia2.jpg"
                    )

                )

            planetsList.add(
                    Planets(
                    "Makemake",
                    "Makemake, formalmente designado como (136472) Makemake (símbolo: Makemake symbol (fixed width).svg),[9] é o terceiro maior planeta anão do Sistema Solar e o maior objeto transnetuniano" +
                            " conhecido na população dos cubewanos,[10][nota 1] com um diâmetro de cerca de dois terços o de Plutão.[14] Possui um satélite conhecido, o S/2015 (136472) 1.[15] Sua superfície é" +
                            " coberta por metano, etano e possivelmente nitrogênio e tem uma baixa temperatura média de cerca de 30 K (-243,2 °C).Inicialmente conhecido como 2005 FY9 e depois pelo código de planeta " +
                            "menor 136472, Makemake foi descoberto em 31 de março de 2005 no Observatório Palomar, por uma equipe liderada por Michael Brown, e anunciado em 29 de julho de 2005. Recebeu o nome do " +
                            "deus rapanui Makemake. Foi formalmente classificado como plutoide e planeta anão em julho de 2008",

                    "https://pt.wikipedia.org/wiki/Makemake",
                    "https://pt.wikipedia.org/wiki/Makemake#/media/Ficheiro:Makemake_hubble.png"
                    )

                )

            planetsList.add(
                    Planets(
                    "Haumea",
                    "Haumea, com a designação de planeta menor 136108 Haumea (símbolo: Haumea symbol (fixed width).svg),[2] antes conhecido astronomicamente como 2003 EL61, é um planeta anão do tipo plutoide, localizado " +
                            "a 43,3 UA do Sol, ou seja, um pouco mais de 43 vezes a distância da Terra ao Sol, em pleno Cinturão de Kuiper. Haumea possui dois pequenos satélites naturais, Hiʻiaka e Namaka, sobre os quais acredita-se " +
                            "serem destroços que se separaram de Haumea em decorrência de uma antiga colisão. Haumea também é o objeto astronômico com a mais rápida rotação no Sistema Solar, durando apenas quatro horas, " +
                            "o que faz com que o planeta-anão seja extremamente deformado, sendo semelhante a uma bola de rugby. ",

                    "https://pt.wikipedia.org/wiki/Haumea",
                    "https://pt.wikipedia.org/wiki/Haumea#/media/Ficheiro:2003EL61art.jpg"
                    )

                )
            
            return planetsList
        }
    }


}