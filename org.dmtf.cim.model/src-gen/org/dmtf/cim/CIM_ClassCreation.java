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
 * A representation of the model object '<em><b>CIM Class Creation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * CIM_ClassCreation notifies when a new class is defined in the schema.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_ClassCreation()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Indication='true' Version='2.6.0' UMLPackagePath='CIM::Event'"
 * @generated
 */
@ProviderType
public interface CIM_ClassCreation extends CIM_ClassIndication {
} // CIM_ClassCreation
