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
 * A representation of the model object '<em><b>CIM File Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * FileAction locates files that already exist on the CIM_ ComputerSystem that defines the Action's environment. These files are removed or moved/copied to a new location.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_FileAction()
 * @model abstract="true"
 *        annotation="http://schemas.dmtf.org/wbem/cim Abstract='true' Version='2.6.0' UMLPackagePath='CIM::Application::CheckAction' keys='Name,Version,SoftwareElementState,SoftwareElementID,TargetOperatingSystem,ActionID'"
 * @generated
 */
@ProviderType
public interface CIM_FileAction extends CIM_Action {
} // CIM_FileAction
