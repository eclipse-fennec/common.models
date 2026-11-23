/*
 * Copyright (c) 2026 Contributors to the Eclipse Foundation.
 * 
 * This program and the accompanying materials are made available under the terms of the Eclipse Public License 2.0 which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *   Data In Motion Consulting - initial implementation
 */
package org.dmtf.cim;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CIM Slot In Slot</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Slots are special types of Connectors into which adapter Cards are typically inserted. The SlotInSlot relationship represents the ability of a special adapter to extend the existing Slot structure to enable otherwise incompatible Cards to be plugged into a Frame or Hosting Board. The adapter effectively creates a new Slot and can be thought of (conceptually) as a Slot in a Slot. This enables Cards that would otherwise be physically and/or electrically incompatible with the existing Slots to be supported, by interfacing to the Slot provided by the adapter. This has many practical uses. For example, networking boards are very expensive. As new hardware becomes available, Chassis and even Card configurations change. To protect the investment of their customers, networking vendors will manufacture special adapters that enable old Cards to fit into new Chassis or Hosting Boards and/or new Cards to fit into old. This is done using a special adapter that fits over one or more existing Slots and presents a new Slot into which the Card can plug.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_SlotInSlot()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.6.0' UMLPackagePath='CIM::Physical::Connector' override.Antecedent='CIM_Slot REF' override.Antecedent.Description='The Antecedent represents the existing Slot(s) of the HostingBoard, or Frame that are being adapted to accommodate a Card that would otherwise not be physically and/or electrically compatible with it.' override.Dependent='CIM_Slot REF' override.Dependent.Max='1' override.Dependent.Description='The new Slot provided by the adapter board.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_SlotInSlot extends CIM_ConnectedTo {
} // CIM_SlotInSlot
