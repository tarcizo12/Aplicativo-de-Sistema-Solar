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
                    "O planeta mais próximo do Sol, que gasta somente oitenta e oito dias para completar seu período de translação, possui uma aparência acinzentada com inúmeras marcas de impactos que lembram a superfície lunar.",

                    )
                )

                planetsList.add(
                    Planets(
                    "Vênus",
                    "Vênusé o segundo planeta do Sistema Solar em ordem de distância a partir do Sol, orbitando-o a cada 224,7 dias. Recebeu seu nome em homenagem à deusa romana do amor e da beleza Vénus, equivalente a Afrodite. Depois da Lua, é o objeto mais brilhante do céu noturno, atingindo uma magnitude aparente de -4,6, o suficiente para produzir sombras. A distância média da Terra a Vênus é de 0,28 AU, sendo esta a menor distância entre qualquer par de planetas.[2] Como Vénus se encontra mais próximo do Sol do que a Terra, ele pode ser visto aproximadamente na mesma direção do Sol (sua maior elongação é de 47,8°).",
                    "O segundo planeta a partir do Sol possui tamanho, composição e massa similares à Terra.",

                    )

                )

                planetsList.add(
                    Planets(
                    "Terra",
                    "A Terra é o terceiro planeta mais próximo do Sol, o mais denso e o quinto maior dos oito planetas do Sistema Solar. É também o maior dos quatro planetas telúricos. É por vezes designada como Mundo ou Planeta Azul. Lar de milhões de espécies de seres vivos,[13] incluindo os humanos, a Terra é o único corpo celeste onde é conhecida a existência de vida. O planeta formou-se há 4,56 bilhões de anos,e a vida surgiu na sua superfície um bilhão de anos depois. Desde então, a biosfera terrestre alterou significativamente.",

                    "O maior planeta telúrico e o quinto maior do Sistema Solar, é o terceiro a contar do Sol.",

                    )

                )

                planetsList.add(
                    Planets(
                    "Marte",
                    "Marte é um planeta rochoso com uma atmosfera fina, com características de superfície que lembram tanto as crateras de impacto da Lua quanto vulcões, vales, desertos e calotas polares da Terra. O período de rotação e os ciclos sazonais de Marte são também semelhantes aos da Terra, assim como é a inclinação que produz as suas estações do ano.",

                    "O planeta telúrico mais afastado do Sol passou a ser um mundo intrigante a partir do advento das observações telescópicas. ",

                    )

                )

                planetsList.add(
                    Planets(
                    "Júpiter",
                    "Júpiter é o maior planeta do Sistema Solar, tanto em diâmetro quanto em massa, e é o quinto mais próximo do Sol.[11] Possui menos de um milésimo da massa solar, contudo tem 2,5 vezes a massa de todos os outros planetas em conjunto. É um planeta gasoso, junto com Saturno, Urano e Netuno. Estes quatro planetas são por vezes chamados de planetas jupiterianos ou planetas jovianos, e são os quatro gigantes gasosos, isto é, que não são compostos primariamente de matéria sólida.[12]",

                    "O maior e mais massivo planeta do Sistema Solar exibe peculiares faixas multicoloridas criadas por fortíssimos ventos que percorrem faixas longitudinais na parte superior de sua atmosfera.",

                    )

                )

                planetsList.add(
                    Planets(
                    "Saturno",
                    "Saturno é o sexto planeta a partir do Sol e o segundo maior do Sistema Solar atrás de Júpiter. Pertencente ao grupo dos gigantes gasosos, possui cerca de 95 massas terrestres e orbita a uma distância média de 9,5 unidades astronômicas. Possui um pequeno núcleo rochoso, circundado por uma espessa camada de hidrogênio metálico e hélio. A sua atmosfera, também composta principalmente de hidrogênio, apresenta faixas com fortes ventos, cuja energia provém tanto do calor recebido do Sol quanto da energia irradiada de seu centro. Entretanto, estas bandas possuem aspecto pouco proeminente, com coloração que varia do marrom ao amarelado, devido à espessa névoa que envolve o planeta, além das camadas de nuvens. Sazonalmente surgem grandes sistemas de tempestades, além de vórtices permanentes existentes nos polos.",

                    "O segundo maior planeta do Sistema Solar possui uma composição semelhante à de Júpiter, rica em hidrogênio e hélio.",

                    )

                )


                planetsList.add(
                    Planets(
                    "Urano",
                    "Urano[11] (Úrano em Portugal[12]) é o sétimo planeta a partir do Sol, o terceiro maior e o quarto mais massivo dos oito planetas do Sistema Solar. Foi nomeado em homenagem ao deus grego do céu, Urano. Embora seja visível a olho nu em boas condições de visualização, não foi reconhecido pelos astrônomos antigos como um planeta devido a seu pequeno brilho e lenta órbita.[13] William Herschel anunciou sua descoberta em 13 de março de 1781, expandindo as fronteiras do Sistema Solar pela primeira vez na história moderna. Urano foi também o primeiro planeta a ser descoberto por meio de um telescópio.",
                    "O sétimo planeta a partir do Sol foi o primeiro a ser descoberto com o auxílio de um telescópio em 1781. À semelhança de Vênus, o sentido de rotação de Urano é retrógrado relativamente ao da maioria dos corpos do Sistema Solar.",

                    )

                )

                planetsList.add(
                    Planets(
                    "Netuno",
                    "O gigante e gelado Netuno é o planeta mais afastado do Sol e foi o primeiro a ser localizado a partir de cálculos matemáticos em vez de observações regulares do céu"
                           ,

                    "O gigante e gelado Netuno é o planeta mais afastado do Sol e foi o primeiro a ser localizado a partir de cálculos matemáticos em vez de observações regulares do céu",

                    )

                )

                planetsList.add(
                    Planets(
                    "Ceres",
                    "Ceres (na designação de planeta menor 1 Ceres; símbolo: ⚳)[1] é um planeta anão localizado no cinturão de asteroides entre Marte e Júpiter, sendo o maior dos asteroides. Desde sua descoberta em " +
                            "janeiro de 1801 por Giuseppe Piazzi, Ceres recebeu diversas classificações, sendo inicialmente considerado planeta e posteriormente asteroide. Em 2006 foi enquadrado na categoria de planeta " +
                            "anão.Possui um formato arredondado e uma superfície escura cheia de crateras. É constituído possivelmente por um núcleo rochoso circundado por um manto de gelo. Sua superfície, conforme" +
                            " anteriormente observado pelo Telescópio Espacial Hubble, apresenta regiões mais escuras, além de locais de brilho proeminente, de natureza ainda desconhecida. ",

                    "Ceres é praticamente invisível quando observado a olho nu. Quando encontra-se em oposição e próximo ao periélio, pode atingir uma magnitude aparente máxima de +6,7.[6] Esse brilho é considerado muito fraco para ser observado a olho nu, mas sob condições excepcionais de observação Ceres pode ser encontrado sem o uso de equipamentos. Somente Vesta pode atingir uma magnitude similar e também, durante raras oposições próximas ao periélio, 2 Pallas e 7 Iris apresentam brilho semelhante.[7]",

                    )

                )

            planetsList.add(
                    Planets(
                    "Plutão",
                    "Plutão, formalmente designado 134340 Plutão (símbolos: \u2BD3 e ♇) é um planeta anão do Sistema Solar e o nono maior e décimo mais massivo objeto observado diretamente orbitando o Sol. " +
                            "Originalmente classificado como um planeta, Plutão é atualmente o maior membro conhecido do cinturão de Kuiper,[11] uma região de corpos além da órbita de Netuno. Como outros membros do " +
                            "cinturão de Kuiper, Plutão é composto primariamente de rocha e gelo e é relativamente pequeno, com aproximadamente um quinto da massa da Lua e um terço de seu volume. Ele tem uma órbita " +
                            "altamente inclinada e excêntrica que o leva de 30 a 49 UA do Sol. Isso faz Plutão ficar periodicamente mais perto do Sol do que Netuno (Neptuno). Atualmente Plutão está a 32,9 UA do Sol.[8] ",

                    "Plutão foi descoberto em 1930 por Clyde Tombaugh e até 2006 foi considerado o nono planeta do Sistema Solar. A partir de 1992, com a descoberta de vários outros objetos similares a ele no Sistema Solar externo, sua classificação como um planeta começou a ser questionada, especialmente após a descoberta em 2005 de Éris, 27% mais massivo que Plutão.[",

                    )

                )

            planetsList.add(
                    Planets(
                    "Éris",
                    "Éris ou 136199 Eris (designação de planeta menor, símbolo: \u2BF0)[2] é um planeta anão[3] plutoide[4] situado nos confins do sistema solar, em uma distância de 97 UA do Sol, em seu afélio, " +
                            "em uma região conhecida como disco disperso.Quando foi descoberto, ficou desde logo informalmente conhecido como o \"décimo planeta\", porque na época seu diâmetro estimado era maior do que o " +
                            "Éris tem um período orbital de cerca de 560 anos e encontra-se a cerca de 97 UA do Sol, em seu afélio. Como Plutão, a sua órbita é bastante excêntrica, e leva o planeta a uma distância de " +
                            "apenas 35 UA do Sol no seu periélio (a distância de Plutão ao Sol varia entre 29 e 49,5 UA, enquanto que a órbita de Neptuno fica por cerca de 30 UA). ",

                    "Éris era a deusa da discórdia. O planeta foi chamado assim porque a sua descoberta lançou a discórdia entre os astrónomos quanto à definição de um planeta e causou, indirectamente, a descida de estatuto de Plutão de \"planeta\" para \"planeta anão\"",

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

                    "Makemake foi descoberto em 31 de março de 2005 no Observatório Palomar (em San Diego, Califórnia), por um grupo liderado por Michael E. Brown,[2] e foi anunciado ao público em 29 de julho de 2005, o mesmo dia do anúncio da descoberta de Éris e dois dias depois do anúncio de Haumea",

                    )

                )

            planetsList.add(
                    Planets(
                    "Haumea",
                    "Haumea, com a designação de planeta menor 136108 Haumea (símbolo: Haumea symbol (fixed width).svg),[2] antes conhecido astronomicamente como 2003 EL61, é um planeta anão do tipo plutoide, localizado " +
                            "a 43,3 UA do Sol, ou seja, um pouco mais de 43 vezes a distância da Terra ao Sol, em pleno Cinturão de Kuiper. Haumea possui dois pequenos satélites naturais, Hiʻiaka e Namaka, sobre os quais acredita-se " +
                            "serem destroços que se separaram de Haumea em decorrência de uma antiga colisão. Haumea também é o objeto astronômico com a mais rápida rotação no Sistema Solar, durando apenas quatro horas, " +
                            "o que faz com que o planeta-anão seja extremamente deformado, sendo semelhante a uma bola de rugby. ",

                    "Planeta anão Haumea. Haumea é uma divindade primitiva do Havaí, deusa do nascimento e da fertilidade. Geralmente é identificada com Papa, uma antiga deusa mãe. Haumea pôde renascer constantemente, pelo que teve muitos filhos com seus próprios rebentos e descendentes. Também estava relacionada com os frutais sagrados, que produziam frutas segundo a sua vontade. E com sua varinha mágica ela povoava as águas que rodeiam as ilhas havaianas com grandes cardumes de peixes",

                    )

                )
            
            return planetsList
        }
    }


}