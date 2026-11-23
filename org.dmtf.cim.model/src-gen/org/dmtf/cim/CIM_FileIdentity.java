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
 * A representation of the model object '<em><b>CIM File Identity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * CIM_FileIdentity indicates that a UnixFile describes Unix- specific aspects of the various subclasses of LogicalFile. The association exists since it forces UnixFile to be weak to (scoped by) the LogicalFile. This is not true in the association's superclass, LogicalIdentity.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_FileIdentity()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.6.0' UMLPackagePath='CIM::System::Unix' override.SystemElement='CIM_LogicalFile REF' override.SystemElement.Min='1' override.SystemElement.Max='1' override.SystemElement.Description='The Logical File.' override.SameElement='CIM_UnixFile REF' override.SameElement.Weak='true' override.SameElement.Max='1' override.SameElement.Description='SameElement represents the additional aspects of the Unix/Linux Logical file.' keys='SystemElement,SameElement'"
 * @generated
 */
@ProviderType
public interface CIM_FileIdentity extends CIM_LogicalIdentity {
} // CIM_FileIdentity
