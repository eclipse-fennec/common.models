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
 * A representation of the model object '<em><b>CIM System BIOS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * SystemBIOS associates a UnitaryComputerSystem's BIOS with the System itself.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_SystemBIOS()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Aggregation='true' Version='2.7.0' UMLPackagePath='CIM::Application::BIOS' override.GroupComponent='CIM_ComputerSystem REF' override.GroupComponent.Aggregate='true' override.GroupComponent.Max='1' override.GroupComponent.Description='The ComputerSystem that boots from the BIOS.' override.PartComponent='CIM_BIOSElement REF' override.PartComponent.Description='The System\'s BIOS.' keys='GroupComponent,PartComponent'"
 * @generated
 */
@ProviderType
public interface CIM_SystemBIOS extends CIM_SystemComponent {
} // CIM_SystemBIOS
