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
 * A representation of the model object '<em><b>CIM Hosted Boot SAP</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * HostedBootSAP defines the hosting UnitaryComputerSystem for a BootSAP. Since this relationship is subclassed from HostedAccessPoint, it inherits the scoping/naming scheme defined for AccessPoint - where an AccessPoint is weak to its hosting System. In this case, a BootSAP must be weak to its hosting UnitaryComputerSystem.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_HostedBootSAP()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.7.0' UMLPackagePath='CIM::System::Boot' override.Antecedent='CIM_ComputerSystem REF' override.Antecedent.Min='1' override.Antecedent.Max='1' override.Antecedent.Description='The UnitaryComputerSystem.' override.Dependent='CIM_BootSAP REF' override.Dependent.Description='The BootSAP hosted on the UnitaryComputer System.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_HostedBootSAP extends CIM_HostedAccessPoint {
} // CIM_HostedBootSAP
