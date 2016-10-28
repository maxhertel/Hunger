/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;
import lib.jdb.control.jdbtable.JDBTable;

/**
 *
 * @author max
 */
public class GrayWhiteTable extends JDBTable
{
    @Override
    public void paintComponent( Graphics g )
    {
      super.paintComponent( g );
    }
    
    @Override
    public Component prepareRenderer( TableCellRenderer renderer, int row, int column )
    {
    Component c = super.prepareRenderer( renderer, row, column );
        Color atual ;
        try {
            atual = row % 2 == 0?Color.white:new Color(190,190,190);
            c.setBackground(atual);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            atual = row % 2 == 0?Color.white:new Color(190,190,190);
            c.setBackground(atual);
        }



    return c;
    }
}
