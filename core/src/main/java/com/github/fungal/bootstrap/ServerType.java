/*
 * The Fungal kernel project
 * Copyright (C) 2010
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */

package com.github.fungal.bootstrap;

/**
 * A server tag
 * @author <a href="mailto:jesper.pedersen@comcast.net">Jesper Pedersen</a>
 */
public class ServerType
{
   private String protocol;
   private String pattern;
   private String value;

   /**
    * Constructor
    */
   public ServerType()
   {
      protocol = "http";
      pattern = "[organisation]/[module]/[revision]/[artifact]-[revision](-[classifier]).[ext]";
      value = null;
   }

   /**
    * Get the protocol
    * @return The value
    */
   public String getProtocol()
   {
      return protocol;
   }

   /**
    * Set the protocol
    * @param v The value
    */
   public void setProtocol(String v)
   {
      protocol = v;
   }

   /**
    * Get the pattern
    * @return The value
    */
   public String getPattern()
   {
      return pattern;
   }

   /**
    * Set the pattern
    * @param v The value
    */
   public void setPattern(String v)
   {
      pattern = v;
   }

   /**
    * Get the value
    * @return The value
    */
   public String getValue()
   {
      return value;
   }

   /**
    * Set the value
    * @param v The value
    */
   public void setValue(String v)
   {
      value = v;
   }
}
