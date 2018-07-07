package com.glapps.mobile.japasseiencceja.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ExpandableListView;
import android.widget.LinearLayout;

import com.glapps.mobile.japasseiencceja.Adapter.MyExpandleAdapter;
import com.glapps.mobile.japasseiencceja.R;
import com.glapps.mobile.japasseiencceja.helper.Background;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Info extends AppCompatActivity {

    //------- Binder View ---------//
    @BindView(R.id.elv_lista)
    ExpandableListView elvLista;
    @BindView(R.id.MLL_info)
    LinearLayout MLLInfo;
    //-----------------------------//
    private final String KEY_EXAMES = "Exame";
    private final String KEY_INSCRICOES = "Inscrições";
    private final String KEY_ATENDIMENTO = "Atendimentos";
    private final String KEY_SENHA = "Senhas";
    private final String KEY_APLICACAO = "Aplicação da Prova";
    private final String KEY_DOCUMENTACAO = "Documentos de Identificação";
    private final String KEY_OBJETOS = "Objetos não permitidos";
    private final String KEY_CORRECAO = "Correção das Provas";
    private final String KEY_DIVULGACAO = "Divulgação dos Resultados";
    private final String KEY_UTILIZACAO = "Utilização dos Resultados";
    Background background;
    MyExpandleAdapter expandableadapter;
    ExpandableListView expandableListView;
    List<String> headers;
    HashMap<String, List<String>> headeritems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        ButterKnife.bind(this);
        configuracoesIniciais();

        setTitle("JaPassei ENCCEJA - INFORMAÇÕES");
        goToInfo();
        //prepareDummyData();
        expandableListView = (ExpandableListView) findViewById(R.id.elv_lista);
        expandableadapter = new MyExpandleAdapter(this, headers, headeritems);
        expandableListView.setAdapter(expandableadapter);
    }



    private void goToInfo() {
        headers = new ArrayList<String>();
        headeritems = new HashMap<String, List<String>>();

        //adding headers
        headers.add("O que é a Escola Naval?"); //1
        headers.add("Quanto tempo é necessário para me formar na Escola Naval?"); //2
        headers.add("O que são Período de Verão e Perído Acadêmico??"); //3
        headers.add("O que acontece após o estágio de verão?"); //4
        headers.add("Quais são os cursos oferecidos pela Escola Naval?"); //5
        headers.add("Qual é função do Oficial do Corpo da Armada?"); //6
        headers.add("Qual é função do Oficial do Fuzileiro Naval?"); //7
        headers.add("Qual é função do Oficial do Corpo de Intendentes?"); //8
        headers.add("Quem tem tatuagem pode ingressar na Marinha?"); //9
        headers.add("Quem pode fazer a prova?"); //10
        headers.add("Quais são as etapas do concurso?"); //11
        headers.add("Como vai funcionar o Encceja para pessoas privadas de liberdade?"); //12
        headers.add("Posso ser atendido(a) pelo meu nome social?"); //13


        //preparing header items data

        List<String> item0 = new ArrayList<String>();
        item0.add("Os Cursos ministrados na Escola Naval (EN), denominados “Cursos de Graduação da Escola Naval”, são destinados à formação de Oficiais para o Corpo da Armada (CA), o Corpo de Fuzileiros Navais (CFN) e o Corpo de Intendentes de Marinha (CIM), são realizados de modo diversificado, proporcionando habilitações de interesse militar-naval, dentro da área de Ciências Navais, tendo seu ensino estruturado em um Ciclo Escolar e um Ciclo Pós-Escolar.");

        List<String> item1 = new ArrayList<String>();
        item1.add("Ciclo Escolar, realizado pelo aluno na graduação de Aspirante,\n" +
                "terá a duração de 4 (quatro) anos letivos, para todos os cursos, sob regime de internato.\n" +
                "Cada ano letivo compreenderá um Período de Verão e um Período Acadêmico.");

        List<String> item2 = new ArrayList<String>();
        item2.add("Período de Verão:\n" +
                "Durante este período serão realizados, respectivamente, o Estágio de Adaptação para os Aspirantes do 1º ano, o Estágio de Sobrevivência no Mar, o Estágio de Sobrevivência na Selva e outros para os Aspirantes do 2º ano e Viagens de Instrução para os Aspirantes do 3º ano. \n\n" +
                "" +
                "Período Acadêmico:\n" +
                "Durante este período serão realizadas as atividades de ensino, treinamento físico e formação militar-naval.");

        List<String> item3 = new ArrayList<String>();
        item3.add("Ao início do 3º ano letivo, após o Estágio de Verão, o Aspirante do sexo masculino fará a opção de Corpo e de Habilitação dentro do Corpo, de acordo com sua ordem de classificação obtida no 2º ano letivo.\n" +
                "A regra acima não se aplica às candidatas do sexo feminino, uma vez que as mesmas ingressarão, já no primeiro ano, no Corpo de Intendente da Marinha, não tendo a opção para posterior troca de Corpo.");

        List<String> item4 = new ArrayList<String>();
        item4.add("Corpo da Armada, Corpo de Fuzileiros e Corpo de Intendentes da Marinha com habilitação em Administração.");

        List<String> item5 = new ArrayList<String>();
        item5.add("Os Oficiais do Corpo da Armada exercerão cargos relativos à aplicação do Poder Naval e seu preparo.");

        List<String> item6 = new ArrayList<String>();
        item6.add("Os Oficiais do Corpo de Fuzileiros Navais exercerão cargos relativos à aplicação do Poder Naval e seu preparo, em especial nas operações anfíbias.");

        List<String> item7 = new ArrayList<String>();
        item7.add("Os Oficiais do Corpo de Intendentes da Marinha exercerão cargos relativos à aplicação e ao preparo do Poder Naval, que visem ao atendimento das atividades logísticas e das relacionadas com a economia, as finanças, o patrimônio, a administração e o controle interno.");

        List<String> item8 = new ArrayList<String>();
        item8.add("A tatuagem é permitida, desde que não contrarie o disposto nas Normas para Apresentação Pessoal de Militares da Marinha do Brasil ou faça alusão à ideologia terrorista ou extremista contrária às instituições democráticas, à violência, à criminalidade, à ideia ou ato libidinoso, à discriminação ou preconceito de raça, credo, sexo ou origem ou, ainda, à ideia ou ato ofensivo às Forças Armadas.");

        List<String> item9 = new ArrayList<String>();
        item9.add("Para fazer a prova do concurso, você precisa ser brasileiro nato ou naturalizado, não pode ser casado (a) ou ter constituído união estável e não pode ter filhos – assim deve permanecer durante todo o curso.\n" +
                "\n" +
                "A idade mínima permitida para ingressar na Escola Naval é de 18 anos completos e a máxima é menos de 23 anos no dia 1º de janeiro do ano do curso. É necessário ter concluído o Ensino Médio ou estar em fase de conclusão do mesmo. O concurso permite o ingresso de homens e mulheres, e só poderá realizá-lo quem estiver em dia com as obrigações civis e militares.");

        List<String> item10 = new ArrayList<String>();
        item10.add("A primeira etapa do concurso é constituída por uma prova objetiva com 40 questões, que se divide em duas fases: Matemática e Física na 1ª fase, que é eliminatória e classificatória; e Português, Inglês e Redação na 2ª fase, também eliminatória e classificatória.\n" +
                "\n" +
                "Após a conclusão das provas, os candidatos são submetidos aos eventos complementares que são eliminatórios, constituídos de:\n" +
                "\n" +
                "a) Inspeção de Saúde (IS);\n" +
                "b) Teste de Aptidão Física (TAF);\n" +
                "c) Verificação de Dados Biográficos (VDB) (Fases preliminar e final);\n" +
                "d) Verificação de Documentos (VD);\n" +
                "e) Avaliação Psicológica (AP); e\n" +
                "f) Período de Adaptação e Curso de Formação (eliminatório e classificatório).");




        //contain header and header items
        headeritems.put(headers.get(0), item0);
        headeritems.put(headers.get(1), item1);
        headeritems.put(headers.get(2), item2);
        headeritems.put(headers.get(3), item3);
        headeritems.put(headers.get(4), item4);
        headeritems.put(headers.get(5), item5);
        headeritems.put(headers.get(6), item6);
        headeritems.put(headers.get(7), item7);
        headeritems.put(headers.get(8), item8);
        headeritems.put(headers.get(9), item9);
        headeritems.put(headers.get(10), item10);



    }

    private void configuracoesIniciais(){
        overridePendingTransition(R.anim.slide_in, R.anim.slide_out);
        background = new Background();
        background.setWallpaper(MLLInfo);
        setTitle("Informações");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
    }

    public void prepareDummyData() {
        headers = new ArrayList<String>();
        headeritems = new HashMap<String, List<String>>();
        //adding headers
        headers.add("O que é a EsSA?"); //
        headers.add("Quais são os pré-requisitos?");
        headers.add("Quando começam as inscrições?");
        headers.add("Qual o dia da prova?");
        headers.add("Quanto devo pagar pela inscrição?");
        headers.add("Quanto recebo após me formar?");
        headers.add("Quantas vagas serão abertas?");
        headers.add("Onde o curso será ministrado?"); //
        headers.add("Como o curso será ministrado?"); //
        headers.add("Quais os benefícios do aluno?"); //
        headers.add("E depois de concluir o Curso de Formação de Sargentos?"); //
        headers.add("Quais são as fases até ingressar na EsSA?"); //

        //preparing header items data
        List<String> primary = new ArrayList<String>();
        primary.add("A Escola de Sargentos das Armas (EsSA) é, atualmente, o estabelecimento de ensino do Exército Brasileiro destinado exclusivamente à formação de Sargentos Combatentes de carreira, das armas de Infantaria, Cavalaria, Artilharia, Engenharia e Comunicações.");

        List<String> duvido2 = new ArrayList<String>();
        duvido2.add("São pré-requisitos para ingresso no concurso de admissão: \n\n" +
                "- Ser brasileiro(a) nato(a) ou naturalizado(a); \n" +
                "- Ter concluído o ensino médio em instituição de ensino reconhecida pelo MEC; \n" +
                "- Ter no mínimo 1,60m se do sexo masculino e 1,55m se do sexo feminino; \n" +
                "- Possuir no mínimo 17 e no máximo 24 anos de idade no dia 31 de dezembro do ano da inscrição; \n" +
                "- Estar em dia com as obrigações eleitorais, dentre outras.");

        List<String> duvidaDiaDaProva = new ArrayList<String>();
        duvidaDiaDaProva.add("Provas: 24/09/2017");

        List<String> secondary = new ArrayList<String>();
        secondary.add("As inscrições de 2017 iniciaram em 08/05/2017 com término em 12/06/2017.");
        List<String> college = new ArrayList<String>();
        college.add("O valor de inscrição é de R$80,00.");
        List<String> duvida4 = new ArrayList<String>();
        duvida4.add("Após a formatura o candidato aprovado no curso de formação será engajado no Exército como 3º Sargento e terá soldo inicial de R$ 3.325,00.");
        List<String> duvida5 = new ArrayList<String>();
        duvida5.add("Para a área de Geral/Aviação masculino há 900 vagas para os cursos de Infantaria, Cavalaria, Artilharia, Engenharia, Comunicações, Intendência, Topografia, Material Bélico – Armamento, Material Bélico – Mecânico Operador, Manutenção de Comunicações, Material Bélico – Mnt Vtr Auto e Aviação – Manutenção. Para a área Geral/Aviação feminino as 100 vagas são para as áreas de Intendência, Topografia, Material Bélico – Mnt Armamento, Material Bélico – Mecânico Operador, Manutenção de Comunicações, Material Bélico – Mnt Vtr Auto e Aviação - Manutenção.\n" +
                "\n" +
                "Na área de Música, as 40 oportunidades são para os seguintes naipes: Clarineta, Flauta em dó/Flautim em dó, Saxhorne, Saxofone, Trombone Tenor/Trombone Baixo, Trompa, Trompete/Cornetim/Flueghorne e Tuba. Por fim, na Saúde, as 60 chances abertas são para o curso de Técnico em Enfermagem.");

        List<String> duvida6 = new ArrayList<String>();
        duvida6.add("Os Cursos de Formação de Sargentos (CFS) serão realizados em aproximadamente 18 meses. Os primeiros sete meses, referentes ao período básico, ocorrerão em uma das 13 (treze) Organizações Militares de Corpo de Tropa situadas nas seguintes cidades: Rio de Janeiro/RJ; Juiz de Fora/MG (2 unidades); Recife/PE; Alegrete/RS; Jundiaí/SP; Pirassununga/SP; Pouso Alegre/MG; Campo Grande/MS; Fortaleza/CE; Blumenau/SC; Jataí/GO; e Altamira/PA.\n" +
                "O restante do curso (11 meses), relativo ao período de qualificação, será ministrado na Escola de Sargentos das Armas (situada em Três Corações/MG), na Escola de Sargentos de Logística (estabelecida no Rio de Janeiro/RJ) ou no Centro de Instrução de Aviação do Exército (localizado em Taubaté/SP), de acordo com a área de atuação escolhida pelo candidato.\n" +
                "");
        List<String> duvida7 = new ArrayList<String>();
        duvida7.add("A formação profissional do Sargento Combatente do Exército é a razão de ser da Escola. Todas as atividades do ano letivo são desenvolvidas com a finalidade de capacitar o aluno ao exercício da função a ser desempenhada nos corpos de tropa.\n" +
                "O ensino, fundamentalmente técnico-profissional, é ministrado de forma prática, considerando que o futuro sargento deve ser, ao mesmo tempo, chefe e executante. As Instruções são dinâmicas e os princípios do “aprender a aprender” operacionalizados em todas as disciplinas de forma a permitir ao futuro sargento a vontade de se auto-aperfeiçoar e o crescimento pessoal e profissional, decorrentes desta atitude.\n" +
                "As atividades de instrução desenvolvem-se em ritmo intenso. Busca-se, constantemente, a imitação das condições de combate. O aluno desempenha, sob a orientação dos instrutores e monitores, funções de executante e de comando, que serão exercidas nos corpos de tropa.\n" +
                "O treinamento físico militar, alvo de atenção especial, fortalece a têmpera do aluno e capacita-o a liderar o seu grupo, sob quaisquer condições.");
        List<String> duvida8 = new ArrayList<String>();
        duvida8.add("O aluno vive em regime de internato durante todo o período de formação, sendo alojado, alimentado e fardado por conta do Estado, além de receber salário militar previsto em lei. Participa, ainda, de atividades sociais, culturais, recreativas e esportivas, patrocinadas pela EsSA e pelo Grêmio dos Alunos da ESA (GRESA). \n" +
                "O curso de Sargentos da Armas, a partir de 2016 será considerado ensino superior, ou seja, após o aluno se tornar um Sargento ele receberá um diploma de nível superior na área Bélica (curso Tecnólogo).");
        List<String> duvida9 = new ArrayList<String>();
        duvida9.add("A cerimônia de encerramento do curso é o ponto culminante e o marco de encerramento do ano escolar, com a entrega dos diplomas e a promoção dos alunos à graduação de 3º Sargento.");
        List<String> duvida10 = new ArrayList<String>();
        duvida10.add("O concurso de admissão para a matrícula nos CFS terá as seguintes fases:\n" +
                "\n" +
                "a) 1ª fase, composta pelas etapas de exame intelectual, valoração de títulos, inspeção de saúde, exame de aptidão física e exame de habilitação musical, para os candidatos da área Música aprovados (aptos) nas etapas anteriores e convocados para este exame prático;\n" +
                "\n" +
                "b) 2ª fase: revisão médica e comprovação dos requisitos biográficos dos candidatos, de caráter eliminatório, quando de sua apresentação nas OMCT.\n" +
                "\n" +
                "As provas (exame intelectual) serão aplicadas provavelmente no dia 24 de setembro de 2017, em locais anunciados no site da EsSa, com bastante antecedência.\n" +
                "\n" +
                "O manual do candidato está acessível no link: http://concurso.esa.ensino.eb.br/priol2017/ e deve ser conferido atentamente.");
       /* List<String> duvida6 = new ArrayList<String>();
        duvida5.add("");*/

        //contain header and header items
        headeritems.put(headers.get(0), primary);
        headeritems.put(headers.get(1), duvido2);
        headeritems.put(headers.get(2), secondary);
        headeritems.put(headers.get(3), duvidaDiaDaProva);
        headeritems.put(headers.get(4), college);
        headeritems.put(headers.get(5), duvida4);
        headeritems.put(headers.get(6), duvida5);
        headeritems.put(headers.get(7), duvida6);
        headeritems.put(headers.get(8), duvida7);
        headeritems.put(headers.get(9), duvida8);
        headeritems.put(headers.get(10), duvida9);
        headeritems.put(headers.get(11), duvida10);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void finish() {
        super.finish();
        onLeaveThisActivity();
    }

    @Override
    public void startActivity(Intent intent) {
        super.startActivity(intent);
        onStartNewActivity();
    }

    @Override
    public void startActivity(Intent intent, Bundle options) {
        super.startActivity(intent, options);
        onStartNewActivity();
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

    //--------------------------- Animacoes de Transicao --------------------------//

    protected void onLeaveThisActivity() {
        overridePendingTransition(R.anim.enter_from_left, R.anim.exit_to_right);
    }

    protected void onStartNewActivity() {
        overridePendingTransition(R.anim.enter_from_right, R.anim.exit_to_left);
    }

    //------------------------------------------------------------------------------//

}
