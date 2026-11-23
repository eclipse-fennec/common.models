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
 * A representation of the model object '<em><b>CIM Card In Slot</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Slots are special types of Connectors into which adapter Cards are inserted. This relationship of a Card in a Slot is made explicit using the CardInSlot association.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_CardInSlot()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.6.0' UMLPackagePath='CIM::Physical::Connector' MappingStrings='[\"MIF.DMTF|System Slot|005.4\"]' override.Antecedent='CIM_Slot REF' override.Antecedent.Description='The Slot into which the Card is inserted.' override.Dependent='CIM_Card REF' override.Dependent.Max='1' override.Dependent.Description='The Card in the Slot.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_CardInSlot extends CIM_PackageInSlot {
} // CIM_CardInSlot
