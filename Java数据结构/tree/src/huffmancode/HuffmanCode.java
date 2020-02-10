package huffmancode;

import java.io.*;
import java.util.*;

public class HuffmanCode {

    //生成赫夫曼树对应的赫夫曼编码
    //1.将赫夫曼编码表存放在Map<Byte,String>形式
    static Map<Byte,String> huffmanCodes = new HashMap<Byte, String>();
    //2.在生成赫夫曼编码表示，需要拼接路径，定义一个StringBuilder存储某个叶子节点的路径
    static StringBuilder stringBuilder = new StringBuilder();


    public static void main(String[] args) {
//        String srcFile ="E://oo.jpg";
//        String dstFile ="E://dst.zip";
//
//        zipFile(srcFile,dstFile);

        String dstFile ="E://oo2.jpg";
        String srcFile ="E://dst.zip";
        unZipFile(srcFile,dstFile);
//        String content = "i like like like java do you like a java";
//        byte[] contentbytes = content.getBytes();
//
//        //数据压缩
//        byte[] huffmanCodeBytes = huffmanZip(contentbytes);
//        System.out.println(Arrays.toString(huffmanCodeBytes));
//
//        //解压
//        byte[] decode = decode(huffmanCodes, huffmanCodeBytes);
//        System.out.println(decode.length);
//        System.out.println("原来字符串;"+new String(decode));
//
    }

    //编写一个方法，完成对压缩文件的解压

    /**
     *
     * @param zipFile 准备解压的文件
     * @param dstFile 将文件解压到哪里
     */
    public static void unZipFile(String zipFile,String dstFile){
        //定义文件的输入流
        InputStream is = null;
        //定义对象输入流
        ObjectInputStream ois = null;
        //定义文件的输出流
        OutputStream os = null;

        try {
            is = new FileInputStream(zipFile);
            ois = new ObjectInputStream(is);
            //读取byte数组
            byte[] huffmanBytes = (byte[])ois.readObject();
            //读取赫夫曼编码表
            Map<Byte,String> huffmanCodes = (Map<Byte,String>)ois.readObject();

            //解码：
            byte[] bytes = decode(huffmanCodes, huffmanBytes);

            //将bytes数组写入目标文件
            os = new FileOutputStream(dstFile);

            os.write(bytes);
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                is.close();
                ois.close();
                os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    //编写方法，将一个文件进行压缩
    public static void zipFile(String srcFile,String desFile){
        //创建输人流
        FileInputStream is = null;
        //创建输出流
        OutputStream os = null;
        ObjectOutputStream oos = null;
        try {
            //创建文件输入流
            is = new FileInputStream(srcFile);
            //创建一个和源文件大小一样的byte[]
            byte[] b = new byte[is.available()];
            //读取文件
            is.read(b);
            //直接对文件压缩
            byte[] huffmanBytes = huffmanZip(b);
            //创建文件输出流，存放压缩文件
            os = new FileOutputStream(desFile);
            oos = new ObjectOutputStream(os);
            //把赫夫曼编码后的字节数组写入压缩文件
            oos.writeObject(huffmanBytes);
            //注意一定要把赫夫曼编码写入压缩文件
            oos.writeObject(huffmanCodes);
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                is.close();
                os.close();
                oos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


    //完成数据的解压
    /**
     *
     * @param huffmanCodes 赫夫曼编码表 map
     * @param huffmanBytes
     * @return
     */
    private static byte[] decode(Map<Byte,String> huffmanCodes,byte[] huffmanBytes){
        //1.先得到HuffmanBytes 对应的二进制的字符串，
        StringBuilder stringBuilder = new StringBuilder();
        //将byte数组转成二进制的字符串
        for(int i = 0;i < huffmanBytes.length;i++){
            byte b = huffmanBytes[i];
            //判断是不是最后一个字节
            boolean flag = (i == huffmanBytes.length-1);
            stringBuilder.append(byteToBitString(!flag,b));
        }

        Map<String,Byte> map = new HashMap<String,Byte>();
        for(Map.Entry<Byte,String> entry:huffmanCodes.entrySet()){
            map.put(entry.getValue(),entry.getKey());
        }

        //创建集合，存放byte
        List<Byte> list = new ArrayList<Byte>();
        for(int i = 0;i < stringBuilder.length();){
            int count = 1;
            boolean flag = true;
            Byte aByte = null;
            while(flag){
                String str = stringBuilder.substring(i,i+count);
                 aByte = map.get(str);
                if(aByte == null){
                    count++;
                }else{
                    flag = false;
                }
            }
            list.add(aByte);
            i += count;
        }
        byte[] bytes = new byte[list.size()];
        for(int i = 0;i < list.size();i++){
            bytes[i] = list.get(i);
        }
        return bytes;
    }

    //byte转为二进制字符串
    private static String byteToBitString(boolean flag,byte b){
        int temp = b;
        if(flag){
            temp |= 256;
        }
        String str = Integer.toBinaryString(temp);

        if(flag){
            return str.substring(str.length()-8);
        }else{
            return str;
        }
    }
    /**
     * 使用一个方法将前面的方法封装起来
     * @param bytes 原字符串数组
     * @return
     */
    private static byte[] huffmanZip(byte[] bytes){
        List<Node> nodes = getNodes(bytes);
        //创建Huffman树
        Node huffmanTreeRoot = createHuffmanTree(nodes);
        //对应赫夫曼编码（根据赫夫曼树）
        getCodes(huffmanTreeRoot);
        //对原始数组压缩
        byte[] zip = zip(bytes, huffmanCodes);
        return zip;
    }

    /**
     *编写一个方法，将字符串对应的byte[]数组，通过生成的赫夫曼编码表，返回一个赫夫曼编码压缩后的byte[]
     * @param bytes 原始的字符串对应的byte[]
     * @param huffmanCodes 生成的赫夫曼编码map
     * @return 返回赫夫曼编码处理后的byte[]
     */
    private static byte[] zip(byte[] bytes,Map<Byte,String> huffmanCodes){
        //1.利用hufumanCodes 将bytes转为 赫夫曼编码对应的字符串
        StringBuilder stringBuilder = new StringBuilder();
        for(byte b:bytes){
            stringBuilder.append(huffmanCodes.get(b));
        }

        int len;
        if(stringBuilder.length() % 8==0){
            len =stringBuilder.length()/8;
        }else{
            len = stringBuilder.length()/8 +1;
        }

        //创建存储压缩后的byte数组
        byte[] huffmanCodesBytes = new byte[len];
        int index = 0;
        for(int i = 0;i < stringBuilder.length(); i += 8){
            String strBytes;
            if(i+8 > stringBuilder.length()){
                strBytes= stringBuilder.substring(i,stringBuilder.length());
            }else{
                strBytes = stringBuilder.substring(i,i+8);
            }
            huffmanCodesBytes[index++] = (byte) Integer.parseInt(strBytes,2);
        }
        return huffmanCodesBytes;
    }


    private static void getCodes(Node root){
        if(root == null){
            return ;
        }
        getCodes(root.left,"0",stringBuilder);
        getCodes(root.right,"1",stringBuilder);
    }

    private static void getCodes(Node node,String code,StringBuilder stringBuilder){
        StringBuilder stringBuilder2 = new StringBuilder(stringBuilder);
        //将code加入到stringBuilder
        stringBuilder2.append(code);
        if(node != null){
            //判断是否叶子节点
            if(node.data == null){//非叶子节点
                //递归
                getCodes(node.left,"0",stringBuilder2);
                getCodes(node.right,"1",stringBuilder2);
            }else{
                huffmanCodes.put(node.data,stringBuilder2.toString());
            }
        }
    }


    /**
     * 前序遍历
     * @param root
     */
    private static void preOrder(Node root){
        if(root != null){
            root.preOrderList();
        }else{
            System.out.println("树为空");
        }
    }
    private static List<Node> getNodes(byte[] bytes){
        ArrayList<Node> nodes = new ArrayList<>();

        //遍历bytes,统计每个次数用map[key,value]
        Map<Byte,Integer> counts = new HashMap<Byte, Integer>();
        for(byte b:bytes){
            Integer count = counts.get(b);
            if(count == null){//map没有这个字符数据
                counts.put(b,1);
            }else{
                counts.put(b,count+1);
            }
        }

        //把一个键值对转化为node
        for(Map.Entry<Byte,Integer> entry:counts.entrySet()){
            nodes.add(new Node(entry.getKey(),entry.getValue()));
        }

        return nodes;
    }

    //创建Huffman树
    private static Node createHuffmanTree(List<Node> nodes){
        while(nodes.size() > 1){
            Collections.sort(nodes);

            Node leftNode = nodes.get(0);
            Node rightNode = nodes.get(1);
            Node parentNode = new Node(null,leftNode.weight+rightNode.weight);
            parentNode.left =leftNode;
            parentNode.right =rightNode;
            nodes.remove(leftNode);
            nodes.remove(rightNode);
            nodes.add(parentNode);
        }
        return nodes.get(0);
    }
}

//创建Node,带权值
class Node implements Comparable<Node>{
    Byte data; //数据
    int weight;//次数
    Node left;
    Node right;

    public Node(Byte data, int weight) {
        this.data = data;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                ", weight=" + weight +
                '}';
    }


    @Override
    public int compareTo(Node o) {
        return this.weight-o.weight;
    }

    //前序遍历
    public void preOrderList(){
        System.out.println(this);
        if(this.left!=null){
            this.left.preOrderList();
        }
        if(this.right!=null){
            this.right.preOrderList();
        }
    }
}
