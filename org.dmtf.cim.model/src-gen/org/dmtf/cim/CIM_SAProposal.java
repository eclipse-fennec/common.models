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
 * A representation of the model object '<em><b>CIM SA Proposal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * SAProposal is a base class defining the common properties of, and anchoring common associations for, IPsec phase 1 and phase 2 proposals. It is defined as a kind of ScopedSettingData (scoped by a ComputerSystem or AdminDomain), since its subclasses define sets of IPsec properties that MUST be applied together, if negotiated. This subclassing is different than that defined in IETF's IPSP Policy draft - where it is subclassed from Policy. The definition as SettingData is more consistent with the application of the properties as a set, to the negotiated Security Association. To indicate that 'this' proposaltransform is negotiated for a Security Association, use the ElementSettingData to associate the proposal and the SA.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_SAProposal()
 * @model abstract="true"
 *        annotation="http://schemas.dmtf.org/wbem/cim Abstract='true' Version='2.8.0' UMLPackagePath='CIM::IPsecPolicy' MappingStrings='[\"IPSP Policy Model.IETF|SAProposal\"]' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_SAProposal extends CIM_ScopedSettingData {
} // CIM_SAProposal
