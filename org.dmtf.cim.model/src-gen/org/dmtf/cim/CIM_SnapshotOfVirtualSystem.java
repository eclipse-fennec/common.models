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
 * A representation of the model object '<em><b>CIM Snapshot Of Virtual System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The CIM_SnapshotOfVirtuaSystem association associates an instance of the CIM_ComputerSystem class representing a virtual system, and an instance of the CIM_VirtualSystemSettingData class representing a snapshot that was captured from the virtual system.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_SnapshotOfVirtualSystem()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.32.0' UMLPackagePath='CIM::System::SystemElements' override.Antecedent='CIM_ComputerSystem REF' override.Antecedent.Min='0' override.Antecedent.Max='1' override.Antecedent.Description='Reference to the instance of the CIM_ComputerSystem class representing a virtual system.' override.Dependent='CIM_VirtualSystemSettingData REF' override.Dependent.Description='Reference to the instance of the CIM_VirtualSystemSettingData class representing a snapshot that was captured from the virtual system.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_SnapshotOfVirtualSystem extends CIM_Dependency {
} // CIM_SnapshotOfVirtualSystem
