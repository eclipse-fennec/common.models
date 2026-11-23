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
 * A representation of the model object '<em><b>CIM Shared Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * SharedElement associates the Share to a LogicalElement that is being exported.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_SharedElement()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.43.0' UMLPackagePath='CIM::System::FileElements' override.SystemElement='CIM_LogicalElement REF' override.SystemElement.Key='true' override.SystemElement.Max='1' override.SystemElement.Description='The LogicalElement (or derived subclass) that is exported as a Share. In the context of file sharing, the LogicalElement will be a LogicalFile (or Directory derived from LogicalFile).' override.SameElement='CIM_Share REF' override.SameElement.Key='true' override.SameElement.Description='The Share that exposes the LogicalElement as an exported object. In the context of file sharing, the Share will be a FileShare (or a derived class).' keys='SystemElement,SameElement'"
 * @generated
 */
@ProviderType
public interface CIM_SharedElement extends CIM_LogicalIdentity {
} // CIM_SharedElement
