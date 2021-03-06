/*
 * This file is part of CRISIS, an economics simulator.
 * 
 * Copyright (C) 2015 Ross Richardson
 * Copyright (C) 2015 John Kieran Phillips
 *
 * CRISIS is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * CRISIS is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with CRISIS.  If not, see <http://www.gnu.org/licenses/>.
 */
package eu.crisis_economics.abm.agent;

import eu.crisis_economics.abm.Agent;

/**
  * An instance-based naming convention for {@link Agent}{@code s}. This class returns the
  * simple class name of the {@link Agent} suffixed with the value of a global counter.
  * The value of the global counter is incremented by {@code 1} every time a new name
  * is requested.
  * 
  * @author phillips
  */
public final class InstanceIDAgentNameFactory implements AgentNameFactory {
   
   private static long
      serial = 0L;
   
   @Override
   public String generateNameFor(final Agent agent) {
      return (agent.getClass().getSimpleName() + serial++);
   }
}
