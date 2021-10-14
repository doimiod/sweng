import unittest
import LCA


class testLCA(unittest.TestCase):


    def setUP(self):
        self.root = LCA.root = LCA.Node(1)
        self.root.left = LCA.Node(2)
        self.root.right = LCA.Node(3)
        self.root.left.left = LCA.Node(4)
        self.root.left.right = LCA.Node(5)
        self.root.right.left = LCA.Node(6)
        self.root.right.right = LCA.Node(7)
        self.root.left.left.left = LCA.Node(8)
        self.root.left.left.right = LCA.Node(9)
        


    def test(self):

        self.assertEquals(LCA.findLCA(LCA.root, 2, 3), 1) 
        self.assertEquals(LCA.findLCA(LCA.root, 5, 7), 1)
        self.assertEquals(LCA.findLCA(LCA.root, 2, 4), 2)
        self.assertEquals(LCA.findLCA(LCA.root, 4, 5), 2) 
        self.assertEquals(LCA.findLCA(LCA.root, 6, 7), 3) 

    def testInvalid(self):
        self.assertEquals(LCA.findLCA(LCA.root, 2, 11), -1)
        

        if __name__ == '__main__':
            unittest.main()