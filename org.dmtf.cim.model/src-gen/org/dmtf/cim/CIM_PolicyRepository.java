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
 * A representation of the model object '<em><b>CIM Policy Repository</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The term 'PolicyRepository' has been confusing to both developers and users of the model. The replacement class name describes model element properly and is less likely to be confused with a data repository. 
 * 
 * A class representing an administratively defined container for reusable policy-related information. This class does not introduce any additional properties beyond those in its superclass AdminDomain. It does, however, participate in a number of unique associations. 
 * 
 * An instance of this class uses the NameFormat value "PolicyRepository".
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_PolicyRepository()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Deprecated='[\"CIM_ReusablePolicyContainer\"]' Version='2.7.0' UMLPackagePath='CIM::Policy' keys='CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_PolicyRepository extends CIM_AdminDomain {
} // CIM_PolicyRepository
