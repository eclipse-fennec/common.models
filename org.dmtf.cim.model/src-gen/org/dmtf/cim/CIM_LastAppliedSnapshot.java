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
 * A representation of the model object '<em><b>CIM Last Applied Snapshot</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The CIM_LastAppliedSnapshot association associates an instance of the CIM_VirtualSystemSettingData class representing a virtual system snapshot that was most recently applied to a virtual system, and the instance of the CIM_ComputerSystem class representing the related virtual system.
 * An instance of this assocation indicates that the referenced snapshot is the snapshot the was last applied to the virtual system from the set of snapshots taken from that virtual system. For each virtual system at any time there is at most one snapshot the last applied snapshot.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_LastAppliedSnapshot()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.32.0' UMLPackagePath='CIM::System::SystemElements' override.Antecedent='CIM_VirtualSystemSettingData REF' override.Antecedent.Min='0' override.Antecedent.Max='1' override.Antecedent.Description='Reference to the instance of the CIM_VirtualSystemSettingData class representing the virtual system snapshot that was last applied to the virtual system.' override.Dependent='CIM_ComputerSystem REF' override.Dependent.Min='0' override.Dependent.Max='1' override.Dependent.Description='Reference to the instance of the CIM_ComputerSystem class representing the virtual system upon which the virtual system snapshot represented by the instance of the CIM_VirtualSystemSettingData class referenced by the Antecedent property was most recently applied.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_LastAppliedSnapshot extends CIM_Dependency {
} // CIM_LastAppliedSnapshot
