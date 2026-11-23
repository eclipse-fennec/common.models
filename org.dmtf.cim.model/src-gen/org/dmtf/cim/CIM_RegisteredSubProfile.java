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
 * A representation of the model object '<em><b>CIM Registered Sub Profile</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A RegisteredSubProfile subclasses RegisteredProfile to indicate that a scoping profile is required to provide context. The latter is specified by the mandatory association, SubProfileRequiresProfile.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_RegisteredSubProfile()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Deprecated='[\"CIM_RegisteredProfile\"]' Version='2.37.0' UMLPackagePath='CIM::Interop' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_RegisteredSubProfile extends CIM_RegisteredProfile {
} // CIM_RegisteredSubProfile
