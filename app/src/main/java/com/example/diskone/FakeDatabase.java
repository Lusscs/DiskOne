package com.example.diskone;

import java.io.Serializable;
import java.util.ArrayList;

public class FakeDatabase implements Serializable{

    ArrayList<Receitas> receitas = new ArrayList<>();
    ArrayList<Walkthrough> walkthroughs = new ArrayList<>();

    public ArrayList<Receitas> getRecipes() {
        return receitas;
    }

    public ArrayList<Walkthrough> getWalkthroughs() {
        return walkthroughs;
    }
    public void setData(){
        Receitas receitas1 = new Receitas();
        Receitas receitas2 = new Receitas();
        Receitas receitas3 = new Receitas();
        Receitas receitas4 = new Receitas();
        Receitas receitas5 = new Receitas();
        Receitas receitas6 = new Receitas();
        Receitas receitas7 = new Receitas();
        Receitas receitas8 = new Receitas();
        Receitas receitas9 = new Receitas();
        Receitas receitas10 = new Receitas();
        Receitas receitas11 = new Receitas();
        receitas1.setTitle("Carne de Panela");
        receitas1.setImageURL("https://comidinhasdochef.com/wp-content/uploads/2019/09/Carne-de-Panela-com-Molho-de-Tomate.jpg");
        receitas1.setDescription("A carne de panela simples já é gostosa, mas tem um jeito de deixar ela ainda mais suculenta e saborosa, quer aprender? Então veja aqui como fazer carne de panela com molho de tomate, sem legumes, feito na panela de pressão. Essa é mais uma daquelas receitas para o dia a dia, que você pode fazer para o almoço ou para um jantar. Aqui eu já ensinei algumas maneira de preparar carne de panela, mas para mim essa é a melhor receita de carne de panela com molho de tomate do mundo! Falo isso porque essa era a mesma receita que minha mãe fazia para o almoço. E hoje eu fiquei com uma vontade enorme de comer uma carne de panela no almoço, da quelas bem temperadas, gostosa, com jeitinho de casa de vó. E o bom é que você pode fazer essa receita de carne de panela com molho de tomate usando coxão duro, dá para fazer também com músculo, alcatra, patinho, paleta e etc.. Para fazer essa receitinha não tem nenhum segredo! Basta seguir aqui o passo a passo de como se faz carne de panela com molho de tomate fácil, rápida e muito suculenta.");
        receitas1.setIngredients("1 kg de carne bovina (músculo, coxão duro, acém)\n"+
                "2 cebolas grandes cotadas em rodelas\n"+
                "5 dentes de alho picadinho\n"+
                "sal a gosto\n"+
                "3 colheres (sopa) de azeite\n"+
                "pimenta do reino á gosto\n"+
                "3 tomates picados sem sementes\n"+
                "cheiro verde á gosto\n"+
                "1 sachê de molho de tomate (340g)\n"+
                "1 colher de sopa de colorau (opcional)");
        receitas1.setPreparationMode("Antes de começar, corte a carne em cubos médios, tempere a carne com alho, sal e pimenta do reino a gosto; Reserve.\n"+
                "Carne de Panela com Molho de Tomate\n"+
                "\n"+
                "Faça uma camada com metade da cebola fatiada na panela de pressão e regue com azeite;\n"+
                "Carne de Panela com Molho de Tomate\n"+
                "\n"+
                "Em seguida faça uma camada com todo o tomate picado;\n"+
                "Por cima, coloque a carne, o cheiro verde, o colorau e o molho de tomate;\n"+
                "DICA: não precisa mexer e nem adicionar água.\n"+
                "Tampe a panela e leve ao fogo médio;\n"+
                "Depois que pegar pressão, abaixe o fogo e deixe cozinhar por 25 minutos;\n"+
                "Em seguida desligue o fogo, aguarde a pressão sair sozinha;\n"+
                "Abra a panela, veja se a carne está molinha e, se precisar, deixe cozinhar por mais 5 minutinhos (sem pressão);\n"+
                "Sirva em seguida.");
        receitas1.setKcal("175 Kcal por porção");
        receitas1.setPreparationTime("25 minutos");
        receitas1.setRediment("6 porções");
        receitas.add(receitas1);

        receitas2.setTitle("Escondidinho de Carne");
        receitas2.setImageURL("https://comidinhasdochef.com/wp-content/uploads/2019/05/Escondidinho-de-Carne-Seca.jpg");
        receitas2.setDescription("Eu não sei se já falei para vocês, mas o meu prato salgado favorito é o escondidinho de carne seca e recentemente aprendi a fazer de um jeito que fica ainda melhor do que o tradicional! E é por isso que enquanto eu comia, eu só pensava que eu não poderia deixar de ensinar para vocês como fazer escondidinho de carne seca que leva um purê de mandioca com batata, recheado de carne seca temperada com bacon, tomate, cebola e pimenta e que ainda é gratinado com uma deliciosa camada de requeijão e parmesão! Devo confessar que essa receita de escondidinho de carne seca não é das mais simples, pois conta com diversos passos, mas também não é difícil, e é só seguir todos os passos de preparo que vou ensinar aqui e você vai fazer o melhor escondidinho de carne seca do mundo e ainda vai ver que é mais fácil de fazer do que parece! Gosto de servir esse escondidinho sempre com um arroz branquinho do lado, uma saladinha de alface e pimenta em conserva, fica tudo muito bom, resultado final é incrível.");
        receitas2.setPreparationTime("60 minutos");
        receitas2.setRediment("8 porções");
        receitas2.setKcal("225 Kcal por porção");
        receitas2.setIngredients("500g de carne seca (traseiro)\n"+
                "1kg de mandioca (sem casca)\n"+
                "4 batatas médias\n"+
                "Folhas de louro\n"+
                "2 colheres (chá) de sal (para a mandioca e batata)\n"+
                "100g de bacon picado\n"+
                "1 cebola média picada\n"+
                "2 dentes de alho picados\n"+
                "1 tomate picado sem sementes\n"+
                "1 pimenta dedo de moça (1/2 sem sementes) picada\n"+
                "1 punhado de cheiro verde picado\n"+
                "1 colher (chá) de manteiga\n"+
                "1/2 xícara (chá) de leite\n"+
                "Requeijão cremoso para gratinar a gosto (opcional)\n"+
                "100g de queijo parmesão ralado para gratinar");
        receitas2.setPreparationMode("Comece cortando as mandiocas descascadas em pedaços;\n"+
                "Coloque as mandiocas cortadas em uma panela de pressão com três folhas de louro e uma colher de chá de sal;\n"+
                "Adicione água à panela, cobrindo com a água de dois a três dedos acima do nível das mandiocas;\n"+
                "Escondidinho de Carne Seca\n"+
                "\n"+
                "Leve a fogo alto e, depois que pegar pressão, abaixe o fogo e deixe cozinhando por 30 minutos;\n"+
                "Enquanto a mandioca cozinha, descasque e corte as batatas em cubinhos;\n"+
                "Escondidinho de Carne Seca\n"+
                "\n"+
                "Leve as batatas cortadas para uma panela com água fervente;\n"+
                "Acrescente uma colher (chá) de sal na água com batatas e deixe cozinhar por 10 minutos ou até que as batatas estejam molinhas;\n"+
                "Escorra a água e reserve as batatas;\n"+
                "Corte a carne seca em cubinhos e lave em um escorredor de macarrão;\n"+
                "Leve a carne a uma panela de pressão e cubra com água, ao menos dois dedos acima da carne;\n"+
                "Para tirar o sal da carne seca, cozinhe por 25 minutos a partir do momento em que a panela pegou pressão;\n"+
                "Escorra a água e prove a carne. Se ela já estiver dessalgada, então já está pronta. Caso ainda esteja muito salgada, repita a operação;\n"+
                "Quando estiver dessalgada, com a ajuda de um garfo, desfie a carne seca e reserve;\n"+
                "Escondidinho de Carne Seca\n"+
                "\n"+
                "Em uma frigideira grande, doure o bacon e refogue a cebola por uns dois minutinhos ou até ficar transparente;\n"+
                "Adicione o alho picado e refogue também;\n"+
                "Adicione a pimenta dedo de moça picada;\n"+
                "Escondidinho de Carne Seca\n"+
                "\n"+
                "DICA: se não gosta de comidas muito picantes, tire metade das sementes e da parte branca da pimenta!\n"+
                "Depois de tudo refogado, acrescente a carne seca à frigideira;\n"+
                "Misture muito bem e adicione o tomate;\n"+
                "Finalize com cheiro verde picado e reserve;\n"+
                "Escondidinho de Carne Seca\n"+
                "\n"+
                "Retire a mandioca da pressão e escorra a água;\n"+
                "DICA: com os dedos, remova os fios que ficam no centro da mandioca porque eles atrapalham para fazer o purê.\n"+
                "Com a ajuda de um garfo ou espremedor de batatas, amasse as batatas e mandiocas e transfira para uma panela;\n"+
                "OBS: as mandiocas são mais rígidas e podem ser mais difíceis de espremer.\n"+
                "Depois de tudo amassado, adicione a manteiga e o leite;\n"+
                "Misture tudo em fogo baixo até que fique uma mistura bem homogênea;\n"+
                "Escondidinho de Carne Seca\n"+
                "\n"+
                "Em um refratário, coloque uma camada de purê e espalhe bem, cobrindo todo o fundo;\n"+
                "Acrescente a carne seca e espalhe sobre a camada de purê;\n"+
                "Escondidinho de Carne Seca\n"+
                "\n"+
                "Cubra toda a carne seca com o restante do purê;\n"+
                "Acrescente uma camada de requeijão cremoso (aquele que vem em pacotinho) e, por cima do requeijão, cubra com uma camada de queijo parmesão;\n"+
                "Leve ao forno preaquecido a uma temperatura média (230°C) por aproximadamente 20 minutos ou até gratinar;\n"+
                "Retire do forno e pode servir como preferir!");
        receitas.add(receitas2);

        receitas3.setTitle("Pão Caseiro");
        receitas3.setImageURL("https://comidinhasdochef.com/wp-content/uploads/2018/08/P%C3%A3o-Caseiro-Simples-e-R%C3%A1pido.jpg");
        receitas3.setDescription("Hoje cedo fui sair para comprar pão na padaria, mas quando coloquei o pé do lado de fora, na hora eu voltei pra traz. O clima estava muito frio a ponto de gear aqui na minha cidade. Então como eu não queria encarar aquele frio, decidi fazer a minha receita de pão caseiro simples e rápido que fica muito fofinho e que minha família ama! E como a receitinha é muito econômica, eu resolvi já fazer 2 receitas para poder deixar guardadinho para os próximos dias, porque o pão caseiro simples e rápido pode ser armazenado por até 3 dias sem embolorar. Além de ser muito prático na hora de preparar. Essa receita de pão caseiro simples e rápido é muito conhecida como pão caseirinho ou pão de minuto, por ser uma receita bem antiga e que todo mundo gosta. Eu aprendi como fazer pão Caseiro simples e rápido com minha vó, ela costumava sempre fazer e rechear com um requeijão caseiro delicioso que ela fazia no sítio. Para quem não gosta de ter que sair de casa todo dia de manhã e pegar fila na padaria só para comprar alguns pãezinhos, a receita de pão caseiro simples e rápido vai ser uma opção perfeita. E quem quiser pode fazer o pão caseiro simples e rápido para vender também, é só embalar certinho e colocar a data de validade. No final dessa receita eu vou deixar um vídeo com uma outra receitinha de pão caseiro que eu garanto que você também vai amar. ");
        receitas3.setPreparationTime("90 minutos");
        receitas3.setRediment("12 porções");
        receitas3.setKcal("130 Kcal por porção");
        receitas3.setIngredients("250 ml de leite morno\n"+
                "1 ovo\n"+
                "1 colher (sopa) de açúcar (20g)\n"+
                "1 colher (café) de sal (3g)\n"+
                "5 g de fermento biológico seco (1/2 pacotinho) ou 15 g fermento fresco\n"+
                "100 ml de óleo\n"+
                "1/2 colher (sopa) de margarina\n"+
                "2 e 1/2 xícaras (chá) de farinha de trigo sem fermento\n"+
                "1 ovo para pincelar");
        receitas3.setPreparationMode("Numa tigela grande, despeje o leite e adicione o fermento.\n"+
                "Misture bem até dissolver o fermento.\n"+
                "Em seguida adicione o óleo, a margarina, o ovo, o sal e o açúcar.\n"+
                "Mexa bem e até que os ingrediente fique bem agregados.\n"+
                "Vá adicionando a farinha aos poucos e inicialmente mexendo com uma colher e depois com as mãos.\n"+
                "Quando a massa estiver bem consistente, transfira ela para uma superfície lisa e continue adicionado a farinha aos poucos e sovando a massa até que fique bem homogênea.\n"+
                "Você deve sovar a massa por cerca de 10 minutos.\n"+
                "Coloque a massa novamente na tigela e cubra com um pano ou plástico filme.\n"+
                "Deixe-a descansar por 30 minutos.\n"+
                "DICA: Se estiver muito frio na sua cidade, coloque dentro do forno desligado.\n"+
                "Passado esse tempo, modele os pãezinhos como desejar.\n"+
                "Pão Caseiro Simples e Rápido\n"+
                "\n"+
                "DICA: Eu gosto de fazer eles em formato de bolinhas.\n"+
                "Em seguida acomode as bolinhas numa forma untada e enfarinhada, deixando um espaço de 2 cm de uma para a outra.\n"+
                "Pão Caseiro Simples e Rápido\n"+
                "\n"+
                "Cubra novamente e deixe descansar por mais 40 minutos.\n"+
                "Passado esse tempo, bata ligeiramente o ovo e pincele em cima dos pãezinhos.\n"+
                "Leve para assar em forno preaquecido, 180ºC, até dourar.");
        receitas.add(receitas3);

        receitas4.setTitle("Macarrão");
        receitas4.setImageURL("https://comidinhasdochef.com/wp-content/uploads/2019/07/Macarr%C3%A3o-na-Panela-de-Press%C3%A3o.jpg");
        receitas4.setDescription("Vou te ensinar a fazer uma receita coringa para você fazer no dia a dia ou em uma ocasião especial. veja aqui o passo a passo de como fazer macarrão na panela de pressão com calabresa, fácil e rápida! Receitas rápidas, barata e que possa ser usadas no dia a dia, é o que todo mundo quer. Afinal nem todo mundo gosta de ficar horas na cozinha preparar uma refeição. Então essa é a receita perfeita para qualquer ocasião. Nos dias em que eu não quero ficar muito tempo na cozinha e preciso de algo rápido e gostoso, então nesses dias eu preparo essa receita de macarrão na panela de pressão simples que fica cremosa e pode ser servida sozinha ou acompanha de um um assado. Para preparar essa deliciosa macarrão na panela de pressão, eu usei o macarrão tipo parafuso, mas você pode usar o macarrão tipo penne ou até mesmo aquele macarrão comum. Essa é aquela receita que não tem como ficar ruim, pois além dos ingredientes que tem aqui, você ainda pode incrementar outros ingredientes e adicionar o tempero que preferir para deixar o seu macarrão na panela de pressão ainda mais gostoso. Você acrescentar frango desfiado, carne moída e até mesmo atum Faça aí na sua casa sem medo, pois todo mundo vai gostar.");
        receitas4.setPreparationTime("50 minutos");
        receitas4.setRediment("6 porções");
        receitas4.setKcal("220 Kcal por porção");
        receitas4.setIngredients("1 pacote de macarrão tipo parafuso\n"+
                "2 colheres de (sopa) de azeite\n"+
                "2 linguiças calabresa fatiada ou picada\n"+
                "Metade de uma cebola picada\n"+
                "pimentão picado a gosto\n"+
                "1 caixa de creme de leite\n"+
                "1 sachê de molho de tomate\n"+
                "2 tabletes de caldo de galinha\n"+
                "Queijo parmesão ralado a gosto");
        receitas4.setPreparationMode("Numa panela de pressão, aqueça o azeite e refogue a calabresa com a cebola;\n"+
                "Adicione o pimentão picado e refogue um pouco;\n"+
                "Macarrão na Panela de Pressão\n"+
                "\n"+
                "Acrescente o molho de tomate e mexa até começar a ferver;\n"+
                "Adicione o creme de leite e mexa bem;\n"+
                "Macarrão na Panela de Pressão\n"+
                "\n"+
                "Em seguida coloque o macarrão e misture tudo;\n"+
                "Macarrão na Panela de Pressão\n"+
                "\n"+
                "Cubra o macarrão com água e esfarele o caldo de galinha;\n"+
                "Mexa bem, adicione o parmesão ralada e, se precisar, adicione sal a gosto;\n"+
                "E em seguida tampe a panela;\n"+
                "Quando começar a pegar pressão, conte 3 minutos e desligue o fogo;\n"+
                "Aguarde a pressão sair sozinha antes de abrir a panela;\n"+
                "Sirva em seguida.");
        receitas.add(receitas4);

        receitas5.setTitle("Bolo de Cenoura Fofinho");
        receitas5.setImageURL("https://comidinhasdochef.com/wp-content/uploads/2018/12/Bolo-de-Cenoura-Fofinho-de-Liquidificador.jpg");
        receitas5.setDescription("Aprenda como fazer bolo de cenoura fofinho de liquidificador com calda de chocolate bem cremosa por cima. Ontem quando cheguei em casa senti um cheirinho gostoso vindo da cozinha, era minha mãe fazendo um bolo de cenoura super gostoso que ela sempre faz. Mas essa receitinha eu nunca tinha compartilhado aqui com vocês e também nunca pedi pra ela me ensinar. Então foi aí que eu aproveitei a ocasião e pedi para minha mãe me ensinar o passo a passo da receita de bolo de cenoura fofinho de liquidificador simples que fica fofo e levemente úmido, perfeito para tomar acompanhado de um cafezinho feito na hora. Não é porque a receita é da minha mãe não, mas confesso que esse é o melhor bolo de cenoura fofinho de liquidificador do mundo! Até porque é nas receitas mais simples que estão os melhores sabores. Então depois que você ver os ingredientes que vão nessa receita de bolo de cenoura fofinho de liquidificador, você vai querer correr para a cozinha e fazer ainda hoje. O bolo de cenoura simples que você vai aprender a fazer aqui, é uma receita clássica e que cai bem a qualquer hora e em qualquer momento. Experimente e veja como é saboroso e fácil de preparar! ");
        receitas5.setPreparationTime("70 minutos");
        receitas5.setRediment("8 porções");
        receitas5.setKcal("180 Kcal por porção");
        receitas5.setIngredients("3 cenouras descascadas e cortada em rodelas\n"+
                "4 ovos\n"+
                "1 xícara (chá) de óleo\n"+
                "1 xícara e 1/2 (chá) de açúcar\n"+
                "2 xícaras (chá) de farinha de trigo (sem fermento)\n"+
                "1 colher (sopa) de fermento em pó químico\n"+
                "1 pitada de sal\n"+
                "1/3 xícara (chá) de água\n"+
                "1/3 xícara (chá) de açúcar\n"+
                "1/2 xícara (chá) de chocolate em pó\n"+
                "1 colher (sopa) manteiga");
        receitas5.setPreparationMode("Coloque no liquidificador, os ovos, a cenoura, o óleo e o açúcar.\n"+
                "Bata tudo por 5 minutinhos. Reserve.\n"+
                "Numa tigela, junte a farinha de trigo peneirada, o fermento em pó e o sal.\n"+
                "Misture bem e em seguida despeje a mistura que foi batida.\n"+
                "Bolo de Cenoura Fofinho de Liquidificador\n"+
                "\n"+
                "Misture até que fique uma massa bem homogênea.\n"+
                "Despeje numa forma untada e enfarinhada.\n"+
                "Leve ao forno preaquecido, 180ºC, por aproximadamente 50 minutos.\n"+
                "Desenforme o bolo.\n"+
                "Numa panela coloque, a água, o açúcar, o chocolate em pó e a manteiga.\n"+
                "Misture tudo muito bem.\n"+
                "Leve ao fogo médio e mexa sem parar por 5 minutinho.\n"+
                "Bolo de Cenoura Fofinho de Liquidificador\n"+
                "\n"+
                "Retire do fogo e despeje essa cobertura por cima do bolo ainda morno.");
        receitas.add(receitas5);

        receitas6.setTitle("Torta de Frango");
        receitas6.setImageURL("https://comidinhasdochef.com/wp-content/uploads/2018/11/Torta-de-Frango-de-Liquidificador-600x600.jpg");
        receitas6.setDescription("Receita de torta de frango de liquidificador passo a passo bem simples, você só aprende aqui! Hoje eu te apresento uma torta de frango maravilhosa quem além de ser extremamente saborosa, ela é muito prática e a massa é feita no liquidificador. Tenho certeza que todo mundo quer aprender como fazer torta de frango de liquidificador que fica com a massa fofinha e gostosa. Se você e uma dessas pessoa, corre pra cozinha e vem comigo fazer essa receitinha. Você pode fazer para um lanche ou até para substituir uma refeição quando estiver com pressa e não quiser fazer algo muito demorado. Além disso, a receita de torta de frango de liquidificador tem uma massa super simples que combina com qualquer recheio, então se você não tiver frango em casa, da para fazer a torta usando o recheio que você quiser ou o que você mais gostar. Quando eu estou com pressa e quero comer um lanche rápido, eu faço essa mesma torta de frango de liquidificador e substituo o frango por sardinha ou atum, fica sensacional. Também dá para adicionar outros ingredientes no recheio de frango ou temperar de maneira diferente. Tudo vai depender do seu gosto. ");
        receitas6.setPreparationTime("90 minutos");
        receitas6.setRediment("12 porções");
        receitas6.setKcal("220 Kcal por porção");
        receitas6.setIngredients("3 ovos\n"+
                "1 xícara (chá) de óleo\n"+
                "1 e 1/2 xícaras (chá) de leite\n"+
                "2 colheres (sopa) bem cheias de queijo ralado\n"+
                "1 colher (café) de sal\n"+
                "2 xícaras (chá) de farinha de trigo\n"+
                "1 colher (sopa) fermento em pó\n"+
                "450g de frango desfiado e temperado a gosto");
        receitas6.setPreparationMode("No liquidificador, coloque os ovos, o óleo, o leite, o queijo ralado, o sal e a farinha de trigo.\n"+
                "DICA: Coloque sempre os ingredientes líquidos primeiro.\n"+
                "Bata tudo por aproximadamente 2 minutos.\n"+
                "Torta de Frango de Liquidificador\n"+
                "\n"+
                "Acrescente o fermento em pó e bata por 15 segundos, para misturar o fermento à massa.\n"+
                "Em seguida despeje metade dessa massa numa forma untada e enfarinhada.\n"+
                "Torta de Frango de Liquidificador\n"+
                "\n"+
                "Em seguida adicione o recheio por cima dessa massa.\n"+
                "DICA: Caso você não queira usar frango para rechear a sua torta, você pode usar queijo, presunto, atum e etc..\n"+
                "Cubra o recheio com o restante da massa.\n"+
                "Leve para assar em forno preaquecido, 180º, por aproximadamente 35 minutos ou até ficar douradinha.");
        receitas.add(receitas6);

        receitas7.setTitle("Frango Desfiado");
        receitas7.setImageURL("https://comidinhasdochef.com/wp-content/uploads/2018/01/Como-Temperar-Frango-Desfiado-640x468.jpg");
        receitas7.setDescription("Se você quer fazer um recheio ou alguma receita com frango desfiado e que deixar ele bem temperado e gostoso, eu vou te ensinar minha receita infalível de como temperar frango desfiado. Muita gente quando vai em algum restaurante, padaria ou pizzaria e pede algum prato com frango desfiado muitas vezes se depara com um frango seco sem sabor, costumo falar que fica parecendo paçoca, então depois de tanto ouvir pessoas falando eu resolvi ensinar a minha receita de como temperar frango desfiado. E bem simples e você pode usar pra tudo desde recheio de pizzas, salgados e até mesmo servir com entradinhas. Chega de fazer frango seco e sem sabor!!! E não é só a temperar não viu, eu também vou te ensinar como desfiar frango de maneira fácil e bem rápida na panela de pressão. O melhor de tudo é que o frango já sai da panela temperado e desfiado, fica maravilhoso. ");
        receitas7.setPreparationTime("60 minutos");
        receitas7.setRediment("8 porções");
        receitas7.setKcal("180 Kcal por porção");
        receitas7.setIngredients("1kg de filé de frango\n"+
                "4 dentes de alho triturados\n"+
                "1 cebola grande cortada em cubinhos\n"+
                "1 lata de tomate pelado (ou molho de tomate)\n"+
                "1/4 xícara (chá) de salsinha picada\n"+
                "pitada de açúcar\n"+
                "sal e pimenta do reino à gosto\n"+
                "Aproximadamente 1 e 1/2 xícara (chá) de água quente");
        receitas7.setPreparationMode("Primeiro corte os filés em cubos.\n"+
                "Coloque um fio de azeite na panela de pressão e doure levemente os cubos de frango.\n"+
                "Acrescente a cebola, o alho e o tomate pelado (ou molho).\n"+
                "Em seguida tempere com sal, pimenta do reino, pitada de açúcar e salsinha.\n"+
                "Cubra o frango com água e tampe a panela de pressão.\n"+
                "Depois que a panela pegar pressão, conte 20 minutos.\n"+
                "Deixa a pressão sair sozinha e destampe a panela.\n"+
                "O frango vai estar quase desfiado, mas ainda vai ter alguns pedacinhos.\n"+
                "Então tampe a panela novamente, e chacoalhe bem (COM VONTADE!), fazendo isso o seu frango vai ficar bem desfiado.\n"+
                "Depois disso o seu frango estará bem temperado e já desfiado.");
        receitas.add(receitas7);

        receitas8.setTitle("Frango no Microondas");
        receitas8.setImageURL("https://comidinhasdochef.com/wp-content/uploads/2017/10/Cozinhar-Frango-no-Microondas-640x455.jpg");
        receitas8.setDescription("Na correria do dia-a-a dia fica cada dia mais dificil ter uma boa alimentação, e pensando nas pessoas que tem pouco tempo para preparar sua comida, eu resolvi descobrir uma forma de como cozinhar frango no microondas em poucos minutos sem perder muito tempo, o frango sai do microondas pronto para desfiar, ele fica molinho e bem cozido. Agora você não tem mais desculpas para comer besteira na rua ou deixar de se alimentar. Faça o teste ai na sua casa, experimente cozinhar o frango no microondas e veja como fica igual ao frango cozinhado na panela normal ou na panela de pressão. Não tem segredo nenhum e você pode fazer o frango para comer na hora por que o frango no microondas fica pronto em apenas 3 minutos. ");
        receitas8.setPreparationTime("15 minutos");
        receitas8.setRediment("4 porções");
        receitas8.setKcal("180 Kcal por porção");
        receitas8.setIngredients("400g de Filé de frango");
        receitas8.setPreparationMode("Limpe os filés e leve ao microondas em uma vasilha própria para microondas (eu uso um prato).\n"+
                "Deixe pro 3 minutos em potência alta.\n"+
                "Retire do microondas e veja se está totalmente cozido, caso seja necessário deixe por mais 30 segundos.");
        receitas.add(receitas8);

        receitas9.setTitle("Nhoque de Batata");
        receitas9.setImageURL("https://comidinhasdochef.com/wp-content/uploads/2018/09/Massa-de-Nhoque-de-Batata-600x600.jpg");
        receitas9.setDescription("Hoje a receita que você vai aprender aqui é super simples, vou te ensinar como fazer massa de nhoque de batata bem leve e macia. Dia de domingo eu costumo reunir minha família em casa e sempre preparar um prato bem especial e saboroso. O prato que fiz nesse último domingo foi um nhoque feito com massa de batata que conquistou todo mundo. Então aproveitando o sucesso que esse nhoque caseiro fez, eu resolvi trazer aqui para vocês a minha receita de massa de nhoque de batata que é bem simples de preparar. Diferente das outras massas, essa massa de nhoque de batata é bem mais fácil de dar ponto, não precisa ficar muito tempo amassando e nem se preocupar se vai ficar com aquele gosto forte da farinha de trigo na massa. Na minha opinião, nhoque é uma das massas mais simples para fazer em casa, porém muita gente deixar de fazer essa receita por achar que é complicado ou que leva ingredientes caros. Mas depois que você fizer essa receita de massa de nhoque de batata em casa, nunca mais você pensará assim. Pois além de ser muito econômica, a massa de nhoque feita com batata e farinha de trigo, é bem prática na hora do seu preparo e não requer nenhuma habilidade na cozinha.");
        receitas9.setPreparationTime("45 minutos");
        receitas9.setRediment("12 porções");
        receitas9.setKcal("120 Kcal por porção");
        receitas9.setIngredients("1 kg de batatas cozidas\n"+
                "1 colher de sopa de manteiga\n"+
                "1 colher de chá de sal\n"+
                "1 pitada de noz moscada (opcional)\n"+
                "1 ovo\n"+
                "1 e 1/2 xícara (chá) de farinha de trigo (aproximadamente)");
        receitas9.setPreparationMode("Amasse bem as batatas até formar uma massa bem uniforme, sem grumos.\n"+
                "Massa de Nhoque de Batata\n"+
                "\n"+
                "Em seguida adicione a manteiga, o sal, a noz moscada e o ovo.\n"+
                "Misture bem amassando a massa até que todos os ingredientes estejam bem envolvidos.\n"+
                "Em seguida vá adicionando a farinha de trigo aos poucos e vá amassando a massa até que fique bem lisa e homogênea.\n"+
                "Massa de Nhoque de Batata\n"+
                "\n"+
                "O ponto é quando a massa ficar um pouquinho mole, mas que não fique grudando nas mãos.\n"+
                "DICA: A quantidade exata vai depender das batatas, algumas são mais aguadas e pode ser que precise adicionar um pouco mais de farinha de trigo para dar ponto.\n"+
                "Em seguida enrole a massa numa superfície lisa e enfarinhas, formando um cordão.\n"+
                "Massa de Nhoque de Batata\n"+
                "\n"+
                "Corte esse cordão em pedacinhos para dar formato no nhoque.\n"+
                "DICA: É importante que você enfarinhe a superfície onde você deixará os nhoques, para que eles não grudem.\n"+
                "Massa de Nhoque de Batata\n"+
                "\n"+
                "A massa está pronta! Agora é só levar para cozinhar.\n"+
                "Coloque a quantidade desejada numa panela com água fervente.\n"+
                "Quando você coloca na água, os nhoques afundam.\n"+
                "No momento em que eles subirem, retire-os imediatamente com uma escumadeira.\n"+
                "Escorra os nhoques e transfira-os para uma travessa ou tigela.\n"+
                "Massa de Nhoque de Batata\n"+
                "\n"+
                "Regue com o molho que preferir (Molho de tomate, molho branco, Molho de Carne e etc.).");
        receitas.add(receitas9);

        receitas10.setTitle("Bolo Simples");
        receitas10.setImageURL("https://comidinhasdochef.com/wp-content/uploads/2018/07/Bolo-Simples-Caseiro-600x600.jpg");
        receitas10.setDescription("Tem dias que um bolinho simples no café da manhã cai super bem! Então eu vou ensinar como fazer bolo simples caseiro com a receita mais fácil do mundo, que é para você fazer em casa usando só ingredientes básicos. Sabe aquele bolo caseiro da vovó? Aquele basiquinho que fica muito fofinho e extremamente saboroso? Garanto que alguma vez na vida você já comeu um desses. Mas se por acaso você nunca comeu o bolo simples caseiro ou já comeu e não sabe ainda como fazer em casa, aprenda agora mesmo o passo a passo da receita de bolo simples caseiro. Na minha infância sempre que eu ia visitar minha vó, ela não deixava faltar aquele bolo simples caseiro super fofinho que só ela sabia fazer. Normalmente ela sempre fazia uma cobertura diferente mas a minha preferida era uma cobertura que ficava bem durinha, simplesmente amava. E aqui, além de te ensinar a fazer a receita de bolo simples caseiro, eu também vou deixar uma receita de cobertura durinha para você deixar seu bolo ainda mais gostoso. Se desejar, você também pode rechear esse bolinho com o que quiser, chocolate, ganache, chantininho e etc. Por ser um bolo básico, vai ser fácil fazer diversas combinações gostosas. O melhor de tudo é que para fazer a receita do bolo simples caseiro, você não precisa usar nem liquidificador e nem batedeira, é tudo feito na mão e em poucos minutos você já poderá comer um delicioso bolinho maravilhoso!");
        receitas10.setPreparationTime("70 minutos");
        receitas10.setRediment("8 porções");
        receitas10.setKcal("140 Kcal por porção");
        receitas10.setIngredients("3 xícaras de chá de farinha de trigo (Sem fermento)\n"+
                "2 xícaras de chá de açúcar\n"+
                "3 ovos\n"+
                "200 ml de leite\n"+
                "4 colheres sopa de manteiga\n"+
                "1 colher de sopa de fermento químico em pó");
        receitas10.setPreparationMode("Numa tigela, junte os ovos, o açúcar e a manteiga.\n"+
                "Bolo Simples Caseiro\n"+
                "\n"+
                "Misture tudo muito bem e adicione o leite.\n"+
                "Continue misturando e depois adicione toda a farinha de trigo.\n"+
                "Bolo Simples Caseiro\n"+
                "\n"+
                "Misture até que a massa fique bem homogênea.\n"+
                "Por ultimo, adicione o fermento e misture delicadamente até que agregue completamente na massa.\n"+
                "Despeje a massa do bolo simples caseiro numa forma untada e enfarinhada.\n"+
                "Bolo Simples Caseiro\n"+
                "\n"+
                "Leve para assar em forno preaquecido, 180ºC, por cerca de 40 minutinhos ou até dourar.");
        receitas.add(receitas10);

        receitas11.setTitle("");
        receitas11.setImageURL("");
        receitas11.setDescription("");
        receitas11.setPreparationTime("");
        receitas11.setRediment("");
        receitas11.setKcal("");
        receitas11.setIngredients("");
        receitas11.setPreparationMode("");
        //recipes.add(recipe);


        ArrayList<Walkthrough> walkthroughs = new ArrayList<>();

        Walkthrough walkthrough = new Walkthrough();
/*
        walkthrough.setTitle("Oque é?");
        walkthrough.setDescription("A gastronomia (do grego gastronomía) é um ramo de conhecimento que abrange a culinária, as bebidas, os materiais usados na alimentação[1] e, em geral, todos os aspectos culturais a ela associados.");
        walkthrough.setImageURL("https://www.ceunsp.edu.br/wp-content/uploads/2020/09/gastronomia.jpg");
        walkthroughs.add(walkthrough);

        walkthrough.setTitle("Por que?");
        walkthrough.setDescription("O prazer proporcionado pela comida é um dos fatores mais importantes da vida depois da alimentação de sobrevivência. A gastronomia nasceu desse prazer e constituiu-se como a arte de cozinhar e associar os alimentos para, deles, retirar o máximo benefício.");
        walkthrough.setImageURL("https://assets.website-files.com/5ce2e8de2575f27cdf7815f1/5dbb5482c4326f9bee881ac9_empreendedores%20da%20gastronomia.jpg");
        walkthroughs.add(walkthrough);

        walkthrough.setTitle("Então, oque obtivemos?");
        walkthrough.setDescription("A humanidade cedo se percebeu das virtudes da associação de certas plantas aromáticas aos alimentos para lhes exaltar o sabor, contribuir para a sua conservação e permitir uma melhor e mais saudável assimilação por parte do corpo.");
        walkthrough.setImageURL("https://breadandcompany.com.br/wp-content/uploads/2020/07/comida-saborosa.jpg");
        walkthroughs.add(walkthrough);

        walkthrough.setTitle("");
        walkthrough.setDescription("");
        walkthrough.setImageURL("");*/

    }

    public FakeDatabase(){

    }
    //walkthroughs.add(walkthrough);

    public class Receitas implements Serializable {
        private String title;
        private String imageURL;
        private String description;
        private String ingredients;
        private String preparationMode;
        private String preparationTime;
        private String rediment;
        private String kcal;

        public Receitas() {

        }

        public Receitas(String title, String imageURL, String description,
                        String ingredients, String preparationMode, String preparationTime,
                        String rediment, String kcal) {
            this.title = title;
            this.imageURL = imageURL;
            this.description = description;
            this.ingredients = ingredients;
            this.preparationMode = preparationMode;
            this.preparationTime = preparationTime;
            this.rediment = rediment;
            this.kcal = kcal;
        }

        public Receitas(String title, String description, String preparationTime) {
            this.title = title;
            this.description = description;
            this.preparationTime = preparationTime;
        }



        public Receitas(String toString, String s, String toString1, String toString2, String toString3) {
        }

        public String getNome() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getImageURL() {
            return imageURL;
        }

        public void setImageURL(String imageURL) {
            this.imageURL = imageURL;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getIngredients() {
            return ingredients;
        }

        public void setIngredients(String ingredients) {
            this.ingredients = ingredients;
        }

        public String getPreparationMode() {
            return preparationMode;
        }

        public void setPreparationMode(String preparationMode) {
            this.preparationMode = preparationMode;
        }

        public String getPreparationTime() {
            return preparationTime;
        }

        public void setPreparationTime(String preparationTime) {
            this.preparationTime = preparationTime;
        }

        public String getRediment() {
            return rediment;
        }

        public void setRediment(String rediment) {
            this.rediment = rediment;
        }

        public String getKcal() {
            return kcal;
        }

        public void setKcal(String kcal) {
            this.kcal = kcal;
        }
    }

    public static class Walkthrough {
        private String title;
        private int imageURL;
        private String description;

        public Walkthrough() {
        }

        public Walkthrough(String title, int imageURL, String description) {
            this.title = title;
            this.imageURL = imageURL;
            this.description = description;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public int getImageURL() {
            return imageURL;
        }

        public void setImageURL(int imageURL) {
            this.imageURL = imageURL;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }
    }

}
